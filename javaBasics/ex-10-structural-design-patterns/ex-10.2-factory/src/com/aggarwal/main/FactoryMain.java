package com.aggarwal.main;

import com.aggarwal.dao.Android;
import com.aggarwal.dao.Apple;
import com.aggarwal.dao.Ios;
import com.aggarwal.dao.Windows;
import com.aggarwal.service.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) throws Exception {
      
        // Basic Approach
        System.out.println("-- Basic Approach  --");

        Ios obj1 = new Android();
        Ios obj2 = new Windows();
        Ios obj3 = new Apple();
        
        obj1.spec();
        obj2.spec();
        obj3.spec();
        
        // Factory Design Pattern Approach:
        System.out.println("-- Factory Method Approach --");

        OperatingSystemFactory osf = new OperatingSystemFactory();
        Ios ios1 = osf.getInstance("Open"); //Depending on Input we an change the object type.
        ios1.spec();

        // Ios ios2 = osf.getInstance("Closed");
        // ios2.spec();
        
        // Ios ios3 = osf.getInstance("Windows");
        // ios3.spec();
    }
} 
