package com.unama;

import java.util.Scanner;

public class letrac {
    public static void main (String[] args){
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a idade do nadador");
            idade = sc.nextInt();
        if(idade <= 10 ){
            System.out.println("infantil");
        }else if(idade <= 17 && idade > 10){
            System.out.println("senior");
        }else{
            System.out.println("senior");
        }

    }

}
