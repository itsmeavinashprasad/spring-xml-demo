package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main{

    public static void main( String[] args ){

        // using XmlBeanFactory
        System.out.println("-> Using XmlBeanFactory");
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie = beanFactory.getBean("movie", Movie.class);
        movie.getInfo();
        System.out.println();

        // using BeanDefinitionRegistry and BeanDefinitionReader
        /*BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(new StaticApplicationContext());
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        BeanDefinitionRegistry beanDefinitionRegistry =  beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = beanDefinitionRegistry.getBeanDefinition("movie");
        System.out.println(beanDefinition.getBeanClassName());
        System.out.println(beanDefinition.getScope());
        context.registerBeanDefinition("movie", beanDefinition);
        context.registerSingleton("movie", movie1);
        movie1 = (Movie)context.getBean("movie");
        movie1.getInfo();*/


        // using ApplicationContext
        System.out.println("-> Using ApplicationContext");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        movie = (Movie)applicationContext.getBean("movie");
        movie.getInfo();
        System.out.println();


    }
}
