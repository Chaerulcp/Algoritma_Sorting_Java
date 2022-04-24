package com.sorting;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomQuickSort {

    public static void main(String[] args) {
        ArrayList<Integer> elements=new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Index : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Index ke "+i+" : ");
            int nilai = scan.nextInt();
            elements.add(nilai);
        }
        System.out.println("Sebelum Di Random Quick Sort : "+elements);
        randomquicksort(elements,0, elements.size()-1);
        System.out.print("Sesudah Random Quick Sort : ");
        for(int i=0;i<elements.size();i++){
            System.out.print(elements.get(i)+" ");
        }
    }

    public static void swap(ArrayList<Integer> elements, int i, int j){
        int temp= elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    public static int partition(ArrayList<Integer> elements, int beg, int end){

        int random=beg + ((int)Math.random()*(elements.size()))/(end-beg+1);
        int last=end;
        swap(elements, random, end);
        end--;

        while(beg<=end){
            if(elements.get(beg)<elements.get(last)) beg++;
            else {
                swap(elements, beg, end);
                end--;
            }
        }
        swap(elements, beg, last);

        return beg;
    }

    public static void randomquicksort(ArrayList<Integer> elements, int beg, int end){
        if(beg>=end) return;
        if(beg<0) return;
        if(end>elements.size()-1) return;

        int pivot = partition(elements, beg, end);
        randomquicksort(elements, beg, pivot-1);
        randomquicksort(elements, pivot+1, end);
    }

}
