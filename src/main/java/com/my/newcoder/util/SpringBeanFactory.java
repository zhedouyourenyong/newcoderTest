package com.my.newcoder.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component(value = "springBeanFactory")
public final class SpringBeanFactory implements ApplicationContextAware
{
    private static ApplicationContext context;

    public static <T> T getBean (Class<T> c)
    {
        return context.getBean(c);
    }

    public static <T> T getBean (String name, Class<T> clazz)
    {
        return context.getBean(name, clazz);
    }

    public static <T> Map<String,T> getBeansOfType ( Class<T> clazz)
    {
        return context.getBeansOfType(clazz);
    }

    @Override
    public void setApplicationContext (ApplicationContext applicationContext) throws BeansException
    {
        context=applicationContext;
    }
}
