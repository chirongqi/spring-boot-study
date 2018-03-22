package com.chirq.study.init;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ChirqNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("apple", new AppleBeanDefinitionParser());
    }
}