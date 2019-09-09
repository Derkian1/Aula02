package com.unama;

import java.util.Scanner;

public class letraE {
    public static void main (String[] args){
        int faltas;
        float media;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero de faltas do aluno:");
        faltas = sc.nextInt();
        System.out.println("informe a media do aluno");
        media = sc.nextFloat();
        if ((faltas >= 40) && (media <= 6.0)){
            System.out.println("aluno não foi aprovado");
        }else{
            System.out.println("aluno foi aprovado");
        }
    }
}
