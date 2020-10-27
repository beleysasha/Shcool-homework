package com.company;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a2 = a/100;
        int a4 = a%100;
        if (a2+a4==100){
            System.out.println("luckyNumber");
        }
    }
}
