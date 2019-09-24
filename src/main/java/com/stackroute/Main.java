package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main{

    public static void main( String[] args ){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("-> Singleton Scope");
        Movie movie = (Movie)applicationContext.getBean("theTransporter");
        movie.getInfo();
        Movie movie2 = (Movie)applicationContext.getBean("theTransporter");
        movie.getInfo();
        System.out.println("Equality Result using scope as singleton: "+ (movie==movie2));
        System.out.println();

        System.out.println("-> Prototype Scope");
        movie = (Movie)applicationContext.getBean("fateOfTheFurious");
        movie.getInfo();
        movie2 = (Movie)applicationContext.getBean("fateOfTheFurious");
        movie2.getInfo();
        System.out.println("Equality Result using scope as prototype: "+ (movie==movie2));
        System.out.println();

        System.out.println("Accessing beans using name");
        movie = (Movie)applicationContext.getBean("jumanji");
        movie.getInfo();
        movie2 = (Movie)applicationContext.getBean("hercules");
        movie2.getInfo();

    }
}
