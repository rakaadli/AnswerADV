package com.rap.answers;

import java.util.Arrays;
import java.util.Scanner;

public class FindPairApps {
    public static void main(String args[]){
        //Baca Array dr user pake scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah array: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Masukan Element Array nya: ");
        for(int i=0; i<size; i++){
            myArray[i] = sc.nextInt();
        }
        //Baca angka dr user~
        System.out.println("masukan angka nya: ");
        int num = sc.nextInt();
        System.out.println("Array yang terbuat: "+ Arrays.toString(myArray));
        System.out.println("index hasil element tersebut adalah4: "+num);
        for(int i=0; i<myArray.length; i++){
            for (int j=i; j<myArray.length; j++){
                if((myArray[i]+myArray[j])== num && i!=j){
                    System.out.println(i+", "+j);
                }
            }
        }
    }
}
