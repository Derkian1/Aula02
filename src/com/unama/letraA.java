package com.unama;

import java.util.Scanner;

public class letraA {

    public static void main(String[] args) {
        int TotalCopias;
        double TotalPago;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de copias");
        TotalCopias = sc.nextInt();
            if (TotalCopias <= 100 ){
              TotalPago = TotalCopias * 0.20;
            } else {
                TotalPago = TotalCopias * 0.25;
        }

        System.out.println("O valor a ser pago é R$" + TotalPago);
    }
}
