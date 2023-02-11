package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Scanner scan;

        int a=0;
        int[] liczba;

        while (a < 111 || a > 999) {
            scan = new Scanner(System.in);
            a = scan.nextInt();
        }

        liczba = new int[3];

        String x[];
        int y[];

        do {
            for (int i = 0; i < 3; i++) {
                liczba[i] = a % 10;
                a /= 10;
            }
            String cyfry[];
            cyfry = new String[3];
            for (int i = 0; i < 3; i++) {
                cyfry[i] = String.valueOf(liczba[i]);
            }


            x = new String[6];
            y = new int[6];

            x[0] = cyfry[0] + cyfry[1] + cyfry[2];
            x[1] = cyfry[0] + cyfry[2] + cyfry[1];
            x[2] = cyfry[1] + cyfry[0] + cyfry[2];
            x[3] = cyfry[1] + cyfry[2] + cyfry[0];
            x[4] = cyfry[2] + cyfry[0] + cyfry[1];
            x[5] = cyfry[2] + cyfry[1] + cyfry[0];
            for (int i = 0; i < 6; i++) {
                y[i] = Integer.valueOf(x[i]);
            }
            Arrays.sort(y);
            System.out.println("Min: " + y[0]);
            System.out.println("Max: " + y[5]);
            a = y[5] - y[0];
            System.out.println(a);

            TimeUnit.SECONDS.sleep(1);
        } while(y[0] != y[5] && a != 495);
            //prawie zawsze dochodzi do 495 i potem idzie petla nieskonczona
    }
}
