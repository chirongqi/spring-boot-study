package com.chirq.study.init;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.chirq.study.config.Apple;

public class AppleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class<Apple> getBeanClass(Element element) {
        return Apple.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String color = element.getAttribute("color");
        if (StringUtils.hasText(id)) {
            bean.addPropertyValue("id", id);
        }
        if (StringUtils.hasText(name)) {
            bean.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(color)) {
            bean.addPropertyValue("color", color);
        }
    }
}