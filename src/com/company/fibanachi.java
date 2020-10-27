package com.company;

public class fibanachi {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 0;
        int c;
        for(int i=0;i<10;i++){
            c = a1+a2;
            System.out.println(c);
            a2=a1;
            a1=c;
        }
    }

}
