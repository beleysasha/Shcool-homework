package com.company;

import java.util.Scanner;

public class expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = (x+3)/Math.sqrt(x*x-9)+Math.sqrt(x+14)/(x+10);
        System.out.println(y);
    }
}
