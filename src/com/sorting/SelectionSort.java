package com.sorting;

import java.util.*;
import java.lang.*;

public class SelectionSort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int index, i, j;
        System.out.print("Masukan Jumlah Index Array : ");
        index = input.nextInt();
        ArrayList<Double> ipk = new ArrayList();

        for (i = 0; i <= index - 1; i++){
            System.out.print("index ke " + i + " : ");
            double nilai = input.nextDouble();
            ipk.add(nilai);
        }
        for (i = 0; i <= index - 2; i++){
            int Ssort;

            Ssort = i;

            for (j = i+1; j <= index - 1; j++){
                if (ipk.get(j) < ipk.get(Ssort)){
                    Ssort = j;
                }
            }
            if (Ssort != i){
                double tampungan, a, b;
                tampungan = ipk.get(i);
                ipk.set(i, ipk.get(Ssort));
                ipk.set(Ssort, tampungan);
            }
        }
        System.out.println(ipk);


    }
}
