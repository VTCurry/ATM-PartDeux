package com.novauc;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[5];

        names [0] = "Donald";
        names [1] = "Barack";
        names [2] = "George";
        names [3] = "Bill";
        names [4] = "George";



        for (String name: names){
            System.out.println(name);
        }

        for (int i=0; i < names.length;i++){
            System.out.println(names[i]);
        }

        int i = 0;
        while (i <= 5) {
            System.out.println("Hello index, "+ i );
            i++;
        }

        int myint = Integer.valueOf ("123");
        System.out.println("Myint: " + myint);

        double mydouble = Double.valueOf("1.5");
        System.out.println ("mydouble: " + mydouble);

        boolean mybool = Boolean.valueOf("true");
        System.out.println ("mybool: " + mybool);

        ArrayList friends = new ArrayList();
        friends.add ("David");
        friends.add ("Peter");
        friends.add ("Jake");
        friends.add ("Vegas");

        System.out.println("Friends on left: " + friends.get(0));
        System.out.println("Friends on right: " + friends.get(1));
        System.out.println("Friends on right: " + friends.get(2));

        HashMap<String, String >presidents = new HashMap();
        presidents.put ("George","703-222-4458");
        presidents.put ("Abraham", "504-532-0001");
        presidents.put ("Hebert", "985-555-1111");

        Object georgesPhone = presidents.get("George");
        System.out.println(georgesPhone)

    }
}
