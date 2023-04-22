package com.aggarwal.model;

//Singleton Class 
public class ABC {

  static ABC obj = new ABC();

  private ABC() {

  };

  public static ABC getInstance() {
    return obj;
  }

}
