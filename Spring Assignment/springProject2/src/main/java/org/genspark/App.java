package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String []args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Person obj = (Person) context.getBean("student");
        obj.display();

    }
}
