package org.example.desafio1;

import java.util.Scanner;

public class Exercicio2 {
    /*Faça um algoritmo que receba um número inteiro
    e retorne se o número é positivo ou negativo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro e direi se é Positivo ou Negativo.");

        System.out.print("Digite um numero:");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else if (num == 0){
            System.out.println("Neutro");
        }

        sc.close();
    }
}
