package com.aggarwal.main;

import com.aggarwal.model.ABC;
import com.aggarwal.model.DEF;

// Singleton Design pattern: Allows only to create 1 instance. 

public class Singleton {
  public static void main(String[] args) throws Exception {

    // Normal DP
    DEF obj1 = new DEF();

    DEF obj2 = new DEF();

    System.out.println("Without Singleton Output");

    System.out.println(obj1); // instance will be new everytime

    System.out.println(obj2);// instance will be new everytime

    // Singleton DP
    ABC obj3 = ABC.getInstance();

    ABC obj4 = ABC.getInstance();

    System.out.println("Singleton Output!");

    System.out.println(obj3); // instance will be same everytime

    System.out.println(obj4);

  }

}
