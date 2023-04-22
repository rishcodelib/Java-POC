package com.aggarwal.dao;

public class PhoneBuilder {

  private String OS;
  private int ram;
  private String processor;
  private double screenSize;
  private int battery; // in mAh format

  public PhoneBuilder setOS(String oS) {
    OS = oS;
    return this;
  }

  public PhoneBuilder setRam(int ram) {
    this.ram = ram;
    return this;
  }

  public PhoneBuilder setProcessor(String processor) {
    this.processor = processor;
    return this;
  }

  public PhoneBuilder setScreenSize(double screenSize) {
    this.screenSize = screenSize;
    return this;
  }

  public PhoneBuilder setBattery(int battery) {
    this.battery = battery;
    return this;
  }

  public Phone getPhone() {
    return new Phone(OS, ram, processor, screenSize, battery);
  }

}
