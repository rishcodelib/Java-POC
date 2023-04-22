package com.aggarwal.dao;

public class AssignmentWork {

  private IPen p;

  public IPen getP() {
    return p;
  }

  public void setP(IPen p) {
    this.p = p;
  }

  public void WriteAssignment(String str) {
    p.write(str);
  }

}
