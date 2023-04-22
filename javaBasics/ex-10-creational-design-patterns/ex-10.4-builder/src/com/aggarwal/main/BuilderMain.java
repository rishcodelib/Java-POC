package com.aggarwal.main;

import com.aggarwal.dao.Phone;
import com.aggarwal.dao.PhoneBuilder;

public class BuilderMain {
    public static void main(String[] args) throws Exception {

        System.out.println("\n Creational: Builder Design Pattern! \n");

        System.out.println("Plan Old way of adding data \n");

        /* Old way of Adding data */
        Phone p = new Phone("android", 2, "Qualcom", 5.5, 3100);
        /*
         * Cons:
         * 1. Sequence matters while adding.
         * 2. Have to remember the sequence of adding.
         * 3. We cannot Make any value as Null.
         */
        System.out.println(p);

        // --------

        /* By Using Builder Design Pattern */
        System.out.println("By Using Builder Design Pattern! \n");

        Phone p2 = new PhoneBuilder().setOS("Apple").setRam(500).getPhone();
        /*
         * Pros:
         * 1. Any Sequence will work while adding.
         * 2. No need to remember the sequence while adding.
         * 3. We can make any value as Null.
         * 4. getPhone(): is used to get the instance.
         */

        System.out.println(p2);

    }
}
