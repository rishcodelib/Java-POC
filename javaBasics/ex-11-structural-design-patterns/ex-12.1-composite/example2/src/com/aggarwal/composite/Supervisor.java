package com.aggarwal.composite;

import java.util.ArrayList;
import java.util.List;

import com.aggarwal.component.IEmployee;

public class Supervisor implements IEmployee {

  private String name;
  private int rating;

  public Supervisor(String name, int rating) {
    this.name = name;
    this.rating = rating;
  }

  List<IEmployee> emp = new ArrayList<>();

  @Override
  public void showRating() {
    System.out.println(name + " : " + rating);

    for (IEmployee e : emp) {
      e.showRating();
    }
  }

  public void addEmployee(IEmployee employee) {
    emp.add(employee);
  }

}
