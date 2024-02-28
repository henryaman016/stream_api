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


        //Fibonacci Example

//        int n1=0,n2=1,n3,i,count=10;
//        System.out.println(n1+" "+n2);
//
//        for (i=2;i<count;++i){
//            n3=n1+n2;
//            System.out.println(" "+n3);
//            n1=n2;
//            n2=n3;
//    }

//        int count = 10;
//        System.out.println(n1 + " " + n2);
//        printFibonacci(count - 2);
//    }
//    static int n1=0,n2=1,n3=0;
//    static void printFibonacci(int count){
//        if (count>0){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.println(" "+n3);
//            printFibonacci(count - 1);
//        }


//        //PRIME NUM
//        System.out.println("Prime no. btn  to 100:");
//
//        for (int i = 2; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.println(i + " ");
//            }
//        }
//    }
//        public static boolean isPrime(int num){
//            if (num<=1){
//                return false;
//            }
//            for (int i=2;i<=Math.sqrt(num);i++){
//                if (num%i==0){
//                    return false;
//                }
//            }
//            return true;


        //Armstrong Numbers

//                System.out.println("Armstrong numbers between 0 and 100:");
//                for (int i = 0; i <= 100; i++) {
//                    if (isArmstrong(i)) {
//                        System.out.print(i + " ");
//                    }
//                }
//            }
//
//            // Check if a number is Armstrong
//            public static boolean isArmstrong(int num) {
//                int originalNum = num;
//                int sum = 0;
//                int numDigits = String.valueOf(num).length();
//
//                while (num > 0) {
//                    int digit = num % 10;
//                    sum += Math.pow(digit, numDigits);
//                    num /= 10;
//                }
//
//                return sum == originalNum;

//
//        ArrayList x=new ArrayList();
//        x.add(10);
//        x.add(20);
//        x.add(30);
//        x.add(50);
//
//
//        System.out.println(x);

//        ArrayList x=new ArrayList();
//        x.add(10);
//        x.add(20);
//        x.add(new Integer(5));
//        x.add("Pankaj");
//        x.add(true);
//        x.add(10.3);
//
//        System.out.println(x);


//        ArrayList<Integer> x = new ArrayList<Integer>();
//        x.add(10);
//        x.add(20);
//        x.add(30);
//        x.add(40);
//        System.out.println("add method(): " + x);
//
//        x.add(1, 500);
//        System.out.println("add(index,value) method():" + x);
//        ArrayList<Integer> y = new ArrayList<Integer>();
//        y.add(300);
//        y.add(500);
//        x.addAll(2, y);
//        System.out.println("addAll(index,collection) method():" + x);
//
//        if (x.contains(500)) {
//            System.out.println("yes present");
//        } else {
//            System.out.println("no present");
//        }
//        x.remove(1);
//        System.out.println("remove(index) method():" + x);
//
//        System.out.println(x.get(1));
//
//        Iterator itr = x.iterator();
//        while (itr.hasNext()) {
//            System.out.println("value of x:" + itr.next());
//        }


//        List<Integer> x=new LinkedList<Integer>();
//        x.add(10);
//        x.add(20);
//        x.add(3);
//        System.out.println("Array size:"+x.size());
//        System.out.println("add method():"+x);
//        x.add(1,500);
//        System.out.println("add(index,value)method():"+x);
//
//        ArrayList<Integer> y=new ArrayList<Integer>();
//        y.add(300);
//        y.add(500);
//        x.addAll(2,y);
//        System.out.println("addAll(index,collection) method():"+x);
//        if (x.contains(500)){
//            System.out.println("yes present");
//        }else {
//            System.out.println("not present");
//        }
//        x.remove(2);
//        System.out.println("remove(index)method():"+x);
//        System.out.println(x.get(1));
//
//        Iterator itr=x.iterator();
//        while (itr.hasNext()){
//            System.out.println("value of x:"+itr.next());
//        }


//        LinkedList<Integer> x=new LinkedList<Integer>();
//        x.add(100);
//        x.add(200);
//        x.add(4000);
//        x.add(756);
//        x.addFirst(5781);
//        x.addLast(846);
//        x.add(258);
//        System.out.println(x);


//        HashSet<Integer> hashSet=new HashSet<Integer>();
////        hashSet.add(20);
////        hashSet.add(30);
////        hashSet.add(40);
////        hashSet.add(50);
////        System.out.println(hashSet);
    }
}

