package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String []args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person obj = (Person) context.getBean(student.class);
        obj.display();

    }
}
