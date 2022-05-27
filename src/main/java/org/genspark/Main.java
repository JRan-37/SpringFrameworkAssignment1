package org.genspark;

import org.genspark.annotations.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main( String[] args )
    {
        System.out.println("\n----Annotations Implementation----");
        org.genspark.annotations.App.start();
        System.out.println("\n\n----Java Config Implementation----");
        org.genspark.javaConfig.App.start();
        System.out.println("\n\n----XML Implementation----");
        org.genspark.xml.App.start();
    }
}
