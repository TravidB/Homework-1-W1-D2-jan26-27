package com.github.tb25;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int[] sortedArr = {1, 3, 7, 8, 2, 4, 5, 6};
            Main m = new Main();
            m.mergeSort(sortedArr);
            for(int r :  sortedArr){
                System.out.print(r);
            }

    }

    public int[] mergeSort(int[] sortArr) {

        mergeSortHelper(sortArr, 0 , sortArr.length - 1);
        return sortArr;
    }

    public void mergeSortHelper(int[] arr, int l, int r) {
        if(l < r){
            int m = (l + r) / 2;
            mergeSortHelper(arr, l, m);
            mergeSortHelper(arr, m + 1, r);

        }
    }

    public void merge(){

    }
}