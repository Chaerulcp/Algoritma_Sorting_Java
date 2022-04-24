package com.sorting;

import java.lang.*;
import java.util.*;

public class MergeSort {
    private final ArrayList<Double> doubleArrayList;

    public MergeSort(ArrayList<Double> doubleArrayList) {
        this.doubleArrayList = doubleArrayList;
    }

    public ArrayList<Double> getArrayAfterSorting() {
        return doubleArrayList;
    }

    public void divideArrayElements(int indexStart, int indexEnd) {

        if (indexStart < indexEnd && (indexEnd - indexStart) >= 1) {
            int middleElement = (indexEnd + indexStart) / 2;

            divideArrayElements(indexStart, middleElement);
            divideArrayElements(middleElement + 1, indexEnd);

            mergeArrayElements(indexStart, middleElement, indexEnd);
        }
    }

    public void mergeArrayElements(int indexStart, int indexMiddle, int indexEnd) {

        ArrayList<Double> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if (doubleArrayList.get(getLeftIndex) <= doubleArrayList.get(getRightIndex)) {

                tempArray.add(doubleArrayList.get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(doubleArrayList.get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(doubleArrayList.get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(doubleArrayList.get(getRightIndex));
            getRightIndex++;
        }


        for (int i = 0; i < tempArray.size(); indexStart++) {
            doubleArrayList.set(indexStart, tempArray.get(i++));

        }

    }

    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Index : ");
        int index = scan.nextInt();
        for (int i = 0; i < index; i++) {
            System.out.print("index ke "+i+" : ");
            Double nilai = scan.nextDouble();
            doubleArrayList.add(nilai);
        }

        MergeSort mergeSort4 = new MergeSort(doubleArrayList);

        System.out.print("Array Sebelum Merge Sort : ");
        for (Double aDouble : mergeSort4.getArrayAfterSorting()) {
            System.out.print(aDouble+" ");
        }

        System.out.println();

        mergeSort4.divideArrayElements(0, doubleArrayList.size() - 1);

        System.out.print("Array Setelah Merge Sort : ");
        for (Double aDouble : mergeSort4.getArrayAfterSorting()) {
            System.out.print(aDouble+" ");
        }
        System.out.println();

    }
}
