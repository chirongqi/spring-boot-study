package com.chirq.study.config;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Configuration
@Component
public class ClassPathScanningService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 
     * <b>方法名</b>：initConfigAnnotationToMap<br>
     * <b>功能</b>：开启扫描器<br>
     * 
     * @author <font color='blue'>chirq</font>
     * @date 2018年3月7日 下午6:31:33
     * @return
     */
    @Bean(name = "initConfigAnnotationToMap")
    String initConfigAnnotationToMap() {
        // 创建包扫描类 不使用默认的TypeFilter
        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(false);
        provider.addIncludeFilter(new AnnotationTypeFilter(Controller.class));
        // 指定包路径
        Set<BeanDefinition> beanDefinitionSet = provider.findCandidateComponents("com.chirq.study.business");
        try {
            Class<?> clazz = null;
            Controller evAnn = null;
            for (BeanDefinition bean : beanDefinitionSet) {
                String name = bean.getBeanClassName();
                logger.info("自定义扫描...：{}", name);
                clazz = Class.forName(name);
                // 事件配置注解
                evAnn = clazz.getAnnotation(Controller.class);
                logger.info("@Controller:{}", evAnn);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            logger.error("", e);
        }
        return "init_ok";
    }
}
