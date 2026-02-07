package com.github.tb25;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] sortArr1 = {1, 3, 7};
        int[] sortArr2 = {2, 4, 5};
        Main m = new Main();
        m.mergeArray(sortArr1, sortArr2);
    }

    public int[] mergeArray(int[] sortArr1, int[] sortArr2) {
        int[] mergeArr = new int[sortArr1.length + sortArr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sortArr1.length && j < sortArr2.length) {
            if (sortArr1[i] <= sortArr2[j]) {
                mergeArr[k] = sortArr1[i++];
            } else {
                mergeArr[k] = sortArr2[j++];
            }
            k++;
        }

        while (i < sortArr1.length) {
            mergeArr[k++] = sortArr1[i++];
        }

        while (j < sortArr2.length) {
            mergeArr[k++] = sortArr1[j++];
        }

        for(int e : mergeArr) {
            System.out.print(e + " ");
        }

        return mergeArr;
    }
}

