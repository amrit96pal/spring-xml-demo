package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args){

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");

        Movie movie1= (Movie) applicationContext.getBean("movie1");
        System.out.println("Age: "+movie1.getActor().getAge()+" name:"+movie1.getActor().getName()+" gender"+movie1.getActor().getGender());

        /*Movie movie2= (Movie) applicationContext.getBean("movie2");
        System.out.println("Age: "+movie2.getActor().getAge()+" name:"+movie2.getActor().getName()+" gender"+movie2.getActor().getGender());
*/
    }
}

