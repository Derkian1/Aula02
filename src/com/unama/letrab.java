package com.unama;

import java.util.Scanner;

public class letrab {

   public static void main(String[] args){
      int TotalProduzido;
      int TotalDefeitos;
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe o total produzido");
         TotalProduzido = sc.nextInt();
      System.out.println("Informe o total de peças com defeito");
         TotalDefeitos = sc.nextInt();
      double linear = TotalProduzido * 0.1;
         if(TotalDefeitos <= linear){
            System.out.println("ENTÂO TA SUSSA SEU FUDIDO!!!");
         } else {
            System.out.println("SEGURA MEU PAU AEW OTAREO PQ A TUA MÀQUINA TA FUDIDA!");
         }
   }
}
