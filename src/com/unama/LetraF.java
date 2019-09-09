package com.unama;

import java.util.Scanner;

public class LetraF {
    public static void main (String[] args){
        double numero1;
        double numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o primeiro numero:");
        numero1 = sc.nextDouble();
        System.out.println("informe o segundo numero");
        numero2 = sc.nextDouble();
        if (numero1 >= numero2){
            System.out.println(numero1 );
        }else {
            System.out.println(numero2);
        }

    }

}
