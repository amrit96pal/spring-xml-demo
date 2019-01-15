package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    Actor actor;
    private ApplicationContext context;
    private BeanFactory beanFactory;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
        System.out.println("This is from the BeanFactory "+beanFactory.getBean("actor"));
    }

    public void setBeanName(String s) {
        System.out.println("The current bean name is "+s);
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
    this.context=context;
        System.out.println("Inside the Application Context aware"+context.getBean("actor"));
    }
}

