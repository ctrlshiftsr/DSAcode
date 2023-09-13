package org.example;

import java.util.Vector;

public class LeastNumberOfNotes {


    public static void main(String[] args) {


        int[] a = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 232;
        int s,count=0;
        for (int i = 0; i < a.length; i++) {
            if(amount>a[i]) {
                s = amount / a[i];
                System.out.println(s + " " + a[i]);
                amount = amount % a[i];
            }

        }


    }
}

