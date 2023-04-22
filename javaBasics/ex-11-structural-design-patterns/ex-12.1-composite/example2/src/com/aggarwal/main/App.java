package com.aggarwal.main;

import com.aggarwal.composite.Supervisor;
import com.aggarwal.leaf.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Employee sde1 = new Employee("Rish", 5);
        Employee sde2 = new Employee("Rishabh", 4);
        Employee sde3 = new Employee("Ranga", 4);

        Supervisor sp = new Supervisor("Ritesh", 4);
        Supervisor spm = new Supervisor("Lakshmi", 4);

        sp.addEmployee(sde1);
        sp.addEmployee(sde2);
        spm.addEmployee(sde3);
        spm.addEmployee(sp);

        spm.showRating();

    }
}
