package labs.lab03;

import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28, 8};
        int[] intArraySorted1 = {1, 2, 3, 4, 5, 6};
        int[] intArraySorted2 = {1, 8, 12, 16, 28, 34};
        int mer[] = new int[intArraySorted1.length + intArraySorted2.length];

        countOddAndEvenNumber(intArr);          //Lab3.1
        findMinAndMax(intArr);                  //Lab3.2
        sortFromMinToMax(intArr);               //Lab3.3
        mergeToSortedArray(intArraySorted1, intArraySorted1.length, intArraySorted2, intArraySorted2.length, mer);          //Lab3.4
    }

    public static void countOddAndEvenNumber(int[] myArray) {
        int j = 0, k = 0;
        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[i] % 2) == 0) {
                j += 1;
            } else {
                k += 1;
            }
        }
        System.out.printf("There are %d even number(s) & %d odd number(s)", j, k);
    }

    public static void findMinAndMax(int[] myArray) {
        int min = myArray[0];
        int max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        System.out.printf("\nMin is: %d\nMax is %d\n", min, max);

    }

    public static void sortFromMinToMax(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                int temp = 0;
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;

                }
            }

        }
        for (int j : myArray) {

            System.out.print(j + " ");
        }

    }

    public static void mergeToSortedArray(int[] myArray1, int a, int[] myArray2, int b, int mer[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a) {
            mer[k] = myArray1[i];
            i++;
            k++;
        }

        while (j < b) {
            mer[k] = myArray2[j];
            j++;
            k++;
        }
        System.out.println();
        sortFromMinToMax(mer);
    }
}
