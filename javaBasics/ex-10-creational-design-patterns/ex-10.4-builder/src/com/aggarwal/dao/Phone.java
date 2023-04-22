package com.aggarwal.dao;

public class Phone {

  private String OS;
  private int ram;
  private String processor;
  private double screenSize;
  private int battery; // in mAh format

  public Phone(String oS, int ram, String processor, double screenSize, int battery) {
    OS = oS;
    this.ram = ram;
    this.processor = processor;
    this.screenSize = screenSize;
    this.battery = battery;
  }

  @Override
  public String toString() {
    return "Phone [OS=" + OS + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize + ", battery="
        + battery + "]";
  }

	

}
