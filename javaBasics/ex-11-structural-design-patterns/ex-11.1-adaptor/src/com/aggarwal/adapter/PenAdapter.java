package com.aggarwal.adapter;

import com.aggarwal.dao.IPen;
import com.aggarwal.other.PilotPen;

public class PenAdapter implements IPen {

  PilotPen pp = new PilotPen();

  @Override
  public void write(String str) {
    pp.mark(str);
  }

}
