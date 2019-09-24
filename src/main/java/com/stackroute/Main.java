package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

    public static void main( String[] args ){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("-> Autowire byName");
        Movie movie = (Movie)applicationContext.getBean("fastAndFurious");
        movie.getInfo();
        System.out.println();

        /*
        * System.out.println("-> Autowire byType");
        * movie = (Movie)applicationContext.getBean("theTransporter");
        * movie.getInfo();
        * System.out.println();
        * */

        System.out.println("-> Autowire constructor");
        movie = (Movie)applicationContext.getBean("hercules");
        movie.getInfo();
        System.out.println();


    }
}
