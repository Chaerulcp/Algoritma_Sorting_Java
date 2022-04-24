package com.sorting;

import java.util.*;
import java.lang.*;

public class InsertionSort {

    public static void main(String[] args) {
        int index, k, n, i;
        ArrayList<Double> ipk = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah index Array : ");
        index = scan.nextInt();
        for (k=0; k< index; k++){
            System.out.print("index ke "+k+" : ");
            double nilai = scan.nextDouble();
            ipk.add(nilai);
        }
        System.out.println("Sebelum Di Sorting : "+ipk);
        n = ipk.size();
        i = 1;
        int j;
        while (i<n){
            double tampungan = ipk.get(i);
            for (j=i; j>0; j--){
                if (tampungan < ipk.get(j-1)){
                    ipk.set(j, ipk.get(j-1));
                }
                else {
                    break;
                }
            }
            ipk.set(j, tampungan);
            i++;
        }
        System.out.println("Sesudah Di Sorting : "+ipk);
    }
}
