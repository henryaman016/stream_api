package com.company;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Reversed String Using Stream Api
//        String str="Anirudh";
//        String reversed= new StringBuilder(str).reverse().toString();
//        System.out.println("Reverse String :"+reversed);

//String str="Amarlata";
//        String reversed= Stream.of(str).map(w->new StringBuilder(w).reverse())
//                .collect(Collectors.joining(" "));
//        System.out.println("Reversed String:"+reversed);


        //swap
//        int a=10;
//        int b=20;
//
//        int temp=a;
//        a=b;
//        b=temp;

        // Swap values without a third variable
//        a = a + b;
//        b = a - b;
//        a = a - b;

//        System.out.println("a:"+a);
//        System.out.println("b:"+b);


        //Pattern Program

        //1. Square Hollow Pattern

//        int n = 6;
//        printPattern(n);
//    }
//
//    public static void printPattern(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//
//            System.out.println();
//        }


        //Number triangle pattern
//        int n = 6;
//        printPattern(n);
//    }
//    public static void printPattern(int n){
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<n-1;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


        //Number increasing Pyramid pattern

//        int n = 6;
//        printPattern(n);
//    }
//    public static void printPattern(int n){
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//Number-Increasing Reverse Pyramid Pattern:
//
//        int n = 6;
//        printPattern(n);
//    }
//    public static void printPattern(int n){
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//

        //Number-Changing Pyramid Pattern:
//        int n = 6;
//        printPattern(n);
//    }
//    public static void printPattern(int n){
//        int num=1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }




        //Descending Order Array

//        int arr[]={1,2,5,6,4,3,9,7};
//        Arrays.sort(arr);
////
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void reverse(int[] arr){
//        int left=0;
//        int right=arr.length-1;
//        while (left<right){
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }


//HashMap

//        Map<String,Integer> scores=new HashMap<>();
//        scores.put("Alice",90);
//        scores.put("Bob",85);
//        scores.put("Charlie",25);
//
//        int aliceScore=scores.get("Alice");
//
//        System.out.println("Alice's score :"+ aliceScore);
//
//       boolean hasKey= scores.containsKey("Bob");
//
//        System.out.println("Has Bob Score"+ hasKey);


//        Hashtable<String ,String > count=new Hashtable<>();
//        count.put("USA","United States");
//        count.put("IND","India");
//        count.put("JPN","Japan");
//        count.put("RSA","Russia");
//
//        String indName=count.get("IND");
//        System.out.println("IND: "+indName);

//
//        List<String > fr=new ArrayList<>();
//
//        fr.add("Apple");
//        fr.add("Banana");
//        fr.add("Orange");
//
//        String secFr=fr.get(1);
//        System.out.println(secFr);
//
//        fr.remove("Banana");
//        System.out.println(fr);

    }

}
