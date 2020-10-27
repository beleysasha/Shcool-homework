package com.company;

public class sum {
    public static void main(String[] args) {
        int x=13;
        for (int a = 0;a<x;a++){
            for (int b = 0;b<x;b++){
                for (int c = 0;c<x;c++){
                    if (a+b+c==x){
                        System.out.println(a+" +"+b+" +"+c+" ="+x);
                    }
                }
            }
        }
    }
}
