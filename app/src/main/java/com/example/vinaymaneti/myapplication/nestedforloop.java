package com.example.vinaymaneti.myapplication;

/**
 * Created by vinaymaneti on 7/26/16.
 */
public class nestedforloop {
    public static void main(String args[]) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= i; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }


    }
}
