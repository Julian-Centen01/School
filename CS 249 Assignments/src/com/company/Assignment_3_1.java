package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Assignment_3_1 {

    public static void main(String[] args) {
        double day = 12500;
        double rewind;
        double difference;
        int skip = 10;
        int remainder = 0;

        for (day = 500; day <= 20000; day++)
        {
            if (day % 20 == 7 || day % 20 == 14 || day % 20 == 0)
            {
                rewind = day * .75;
                difference = day - rewind;
                if (difference % skip <= 20)
                {
                    System.out.println(day);
                }
            }
            if (day % 500 == 0 && day != 500)
                skip = skip + 10;
        }
    }
}