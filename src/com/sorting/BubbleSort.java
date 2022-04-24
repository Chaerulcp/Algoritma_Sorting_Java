package com.sorting;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.lang.*;

public class BubbleSort {
    public static void main(String[] args) {
        int index, i, j;
        ArrayList<Double> ipk = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah index Array : ");
        index = scan.nextInt();

        for (i = 0; i < index; i++) {
            System.out.print("index ke " + i + " : ");
            double nilai = scan.nextDouble();
            ipk.add(nilai);
        }
        System.out.println("Sebelum DiSorting : " + ipk);
        for (i = 0; i < ipk.size(); i++) {
            for (j = 0; j < ipk.get(j + 1); j++) {
                if (ipk.get(j) > ipk.get(j+1)){
                    double tampungan = ipk.get(j);
                    ipk.set(j, ipk.get(j + 1));
                    ipk.set(j + 1, tampungan);

                }
            }
        }
        System.out.println("Setelah Di Sorting : "+ipk);
    }
}
