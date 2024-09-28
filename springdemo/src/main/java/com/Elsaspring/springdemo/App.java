package com.Elsaspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
       laptop lap =(laptop)context.getBean("laptop");
       lap.feature();
       /*dell d=(dell)context.getBean("dell");
        d.feature();
        */
          
    	ApplicationContext con =new ClassPathXmlApplicationContext("student.xml");
        college obj =(college)con.getBean("college");
         obj.display();
         
         
    	/*ApplicationContext context =new ClassPathXmlApplicationContext("student.xml");
        subject obj=(subject)context.getBean("subject");
        subject.display();
         System.out.println("brand");
         System.out.println("hi");
         System.out.println(obj);
         System.out.println(context);*/
         
    }
}
/*demonstrate the use of dependency injection using setter method approach */