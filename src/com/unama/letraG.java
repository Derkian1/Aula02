package com.unama;

import java.util.Scanner;

public class letraG {
    public static void main (String[] args){
        int numero1;
        Scanner sc =  new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        numero1 = sc.nextInt();
        if (numero1 % 2 == 0) {
        System.out.println("É Par");

        }else {
            System.out.println("É impar");
        }
    }

}
