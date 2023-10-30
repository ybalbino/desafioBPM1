package org.example.desafioLogicaCondicionais;

import java.util.Scanner;

public class Exercicio1 {
    /*Faça um algoritmo que dados 2 números inteiros seja informado
     na saída do console qual número é o maior*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros e irei te revelar qual é o maior:");

        System.out.print("Primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é o numero maior.");
        } else {
            System.out.println(num2 + " é o numero maior.");
        }
        sc.close();

    }
}
