package com.sorting;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort app = new QuickSort();
        List<Double> input = app.generateRandomNumbers(5);

        System.out.println("Nilai Inputan Random Sebelum Di QuickSort : "+input);

        System.out.println("Setelah Di QuickSort : "+app.quicksort(input));

    }
    private List<Double> quicksort(List<Double> input){

        if(input.size() <= 1){
            return input;
        }

        int middle = (int) Math.ceil((double)input.size() / 2);
        Double pivot = input.get(middle);

        ArrayList<Double> less = new ArrayList<Double>();
        ArrayList<Double> greater = new ArrayList<Double>();

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i) <= pivot){
                if(i == middle){
                    continue;
                }
                less.add(input.get(i));
            }
            else{
                greater.add(input.get(i));
            }
        }

        return concatenate(quicksort(less), pivot, quicksort(greater));
    }
    private List<Double> concatenate(List<Double> less, Double pivot, List<Double> greater){

        ArrayList<Double> list = new ArrayList<Double>();

        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }

        list.add(pivot);

        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }

        return list;
    }


    private List<Double> generateRandomNumbers(int n){

        ArrayList<Double> list = new ArrayList<Double>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextDouble(n * 10));
        }

        return list;
    }
}
