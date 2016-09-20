package com.example.vinaymaneti.myapplication;

import java.util.Scanner;

/**
 * Created by vinaymaneti on 7/26/16.
 */
public class breakinwhile {
    public static void main(String args[]) {
        double a;
        double sum = 0.0;
        System.out.println("Please enter the Number for addition, -1 to stop");
        Scanner scanner = new Scanner(System.in);
        do {
            a = scanner.nextDouble();
            if (a < 0) {
                break;
            }
            sum = sum + a;
            System.out.println("sum :-" + sum);
        } while (true);
        System.out.println(" total sum :-" + sum);

    }
}
