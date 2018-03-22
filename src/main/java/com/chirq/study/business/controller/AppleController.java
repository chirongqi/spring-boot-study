package com.chirq.study.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chirq.study.config.Apple;

/**
 * 
 * <b>类名</b>：ChinagpayController.java<br>
 * <p>
 * <b>标题</b>： 爱农代付模拟器
 * </p>
 * <p>
 * <b>描述</b>：
 * 
 * </p>
 * <p>
 * <b>版权声明</b>：Copyright (c) 2017
 * </p>
 * <p>
 * <b>公司</b>：namibank
 * </p>
 * 
 * @author <font color='blue'>chirq</font>
 * @version 1.0
 * @date 2017年5月5日 下午1:59:30
 */
@Controller
@RequestMapping("test")
public class AppleController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Apple apple;

    /**
     * 
     * <b>方法名</b>：bgTransService<br>
     * <b>功能</b>：接口方法<br>
     * 
     * @author <font color='blue'>chirq</font>
     * @date 2017年5月5日 下午1:59:45
     * @param params
     * @return
     */
    @RequestMapping(value = "apple", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String bgTransService(HttpServletRequest request) {
        logger.info("apple:{}", apple);
        return apple.toString();
    }
}
