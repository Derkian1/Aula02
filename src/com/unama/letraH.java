package com.unama;

import java.util.Scanner;

public class letraH {
    public static void main(String[] args){
        String Sexo;
        float altura;
        float peso;
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe seu sexo");
        Sexo = sc.next();
        System.out.println("Informe sua altura");
        altura = sc.nextFloat();
        if (Sexo.toLowerCase().equals("masculino") ){
            peso = (float) (72.7 * altura - 58);
            System.out.println("seu peso ideal é: " + peso);
        }else if (Sexo.toLowerCase().equals("Feminino")){
            peso = (float) (62.1*altura - 44.7 );
                System.out.println("seu peso ideal é: " + peso);
        }

    }

}
