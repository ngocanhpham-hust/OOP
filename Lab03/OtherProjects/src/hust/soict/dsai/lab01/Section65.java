package hust.soict.dsai.lab01;

import java.util.*;
public class Section65 {
    public static void main(String[] args) {
        /*
        Using a constant array
        */
        int[] arr = {937, 712, 563, 423, 190, 325, 648, 278, 861, 542, 789, 96, 834, 257, 417,
                602, 373, 149, 805, 936, 268, 573, 487, 795, 649, 128, 305, 754, 590, 847,
                383, 164, 512, 911, 225, 756, 43, 681, 276, 504, 718, 926, 342, 654, 988, 100};

        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

