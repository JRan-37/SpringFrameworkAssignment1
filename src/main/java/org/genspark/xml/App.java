package org.genspark.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringXML.xml");

        Student sdt = (Student) context.getBean("Student");

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
