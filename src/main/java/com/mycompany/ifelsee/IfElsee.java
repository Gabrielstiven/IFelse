package com.mycompany.ifelsee;

import java.util.Scanner;

public class IfElsee {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Escreva algum numero inteiro");
        numero = teclado.nextInt();
         */

 /*
        System.out.println("digite um numero par ou impar");
        numero = teclado.nextInt();
        
        if (numero %2 == 0){
                    System.out.println("par");

        }    
        else{
        System.out.println("impar");
                }
         */
        int pedido, quantidade;
        double total;

        System.out.println("faça seu pedido");
        pedido = teclado.nextInt();
        if (pedido == 1) {
            System.out.println("escreva a quantidade desejada");
            quantidade = teclado.nextInt();
            total = quantidade * 4.0;
            System.out.println(total);
            System.out.printf("seu pedido deu um total de R$%.2f ", total);
        } else if (pedido == 2) {
            System.out.println("escreva a quantidade desejada");
            quantidade = teclado.nextInt();
            total = quantidade * 4.50;

            System.out.printf("seu pedido deu um total de R$%.2f ", total);
        } else if (pedido == 3) {
            System.out.println("escreva a quantidade desejada");
            quantidade = teclado.nextInt();
            total = quantidade * 5.00;
            System.out.printf("seu pedido deu um total de R$%.2f ", total);
        } else if (pedido == 4) {
            System.out.println("escreva a quantidade desejada");
            quantidade = teclado.nextInt();
            total = quantidade * 2.00;
            System.out.printf("seu pedido deu um total de R$%.2f ", total);
        } else if (pedido == 5) {
            System.out.println("escreva a quantidade desejada");
            quantidade = teclado.nextInt();
            total = quantidade * 3.00;
            System.out.printf("seu pedido deu um total de R$%.2f ", total);

        }

    }
}
