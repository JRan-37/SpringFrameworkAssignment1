package org.genspark.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App 
{
    public static void start()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.genspark.annotations");
        context.refresh();
        Student sdt = (Student) context.getBean("student");

        System.out.println(sdt.getName());
        System.out.println(sdt.getId());
        List<Phone> ph = sdt.getPh();
        System.out.println(ph.get(0).getMob());
        Address add = sdt.getAdd();
        System.out.println(add.getCity());
        System.out.println(add.getState());
        System.out.println(add.getCountry());
        System.out.println(add.getZipcode());
    }

}
