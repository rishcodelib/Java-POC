package com.aggarwal.main;

import com.aggarwal.composite.Component;
import com.aggarwal.composite.Composite;
import com.aggarwal.composite.Leaf;

public class CompositeDP {
    public static void main(String[] args) throws Exception {
        // Whenever we have tree of objects hierachical we use composite design pattern
        System.out.println("\n Structural: Composite Design Pattern! \n ");

        Component hd = new Leaf(4000, "hdd");
        Component mouse = new Leaf(1000, "mouse");
        Component monitor = new Leaf(10000, "monitor");
        Component ram = new Leaf(200, "ram");
        Component cpu = new Leaf(9000, "cpu");

        Composite ph = new Composite("Periphiral");
        Composite cabinet = new Composite("cabinet");
        Composite mb = new Composite("motherboard");
        Composite computer = new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

       ph.showPrice();
    }
}
