package com.aggarwal.leaf;

import com.aggarwal.component.IEmployee;

public class Employee implements IEmployee {

  private String name;

  private int rating;

  public String getName() {
    return name;
  }

  public int getRating() {
    return rating;
  }

  public Employee(String name, int rating) {
    this.name = name;
    this.rating = rating;
  }

  @Override
  public void showRating() {
    System.out.println(name + " : " + rating);
  }

}
