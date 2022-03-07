package com.skycloud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class Main
{
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
