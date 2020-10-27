package com.company;

import java.util.Scanner;

public class Proste {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
        int sum = 0;
	    for (int i = 1; i<=a;i++){
	        if (a%i==0){
                sum = sum+1;
            }
        }
        if (sum==2 | a==1){
            System.out.println("Просте");
        }
        else{
            System.out.println("Не просте");
        }
    }
}
