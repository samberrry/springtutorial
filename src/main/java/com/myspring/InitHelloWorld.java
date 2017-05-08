package com.myspring;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Hessam on 5/8/17.
 */
public class InitHelloWorld implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean,String beanName){
        System.out.println("BeforeInitialization : "+beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean,String beanName){
        System.out.println("AfterInitialization : "+beanName);
        return bean;
    }
}
