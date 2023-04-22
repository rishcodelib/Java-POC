package com.aggarwal.main;

import com.aggarwal.adapter.PenAdapter;
import com.aggarwal.dao.AssignmentWork;
import com.aggarwal.dao.IPen;

public class AdapterMain {
    public static void main(String[] args) throws Exception {
        System.out.println(" \n Structural : Adapter Design Patters! \n");
        IPen p = new PenAdapter();

        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.WriteAssignment("I am Bit Tired to write an assignment");
    }
}
