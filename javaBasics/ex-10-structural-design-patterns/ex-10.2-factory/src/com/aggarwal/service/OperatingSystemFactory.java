package com.aggarwal.service;

import com.aggarwal.dao.Android;
import com.aggarwal.dao.Apple;
import com.aggarwal.dao.Ios;
import com.aggarwal.dao.Windows;

public class OperatingSystemFactory {

  public Ios getInstance(String str) {

    if (str.equals("Open")) {

      return new Android();
    } else if (str.equals("Closed")) {
      return new Apple();
    } else {
      return new Windows();
    }

  }
}
