package org.example.desafio1;

import java.util.Scanner;

public class Exercicio4 {
    /*Faça um algoritmo que receba uma nota entre 0 e 10, e retorne no console o valor conforme regras abaixo:
  a.	Aprovado – caso a nota seja maior ou igual a 8
  b.	Em recuperação – caso a nota seja maior ou igual que 6 e menor que 8
  c.	Reprovado – caso a nota seja inferior a 6*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota de 0 a 10 para saber se foi aprovado:");
        int nota = sc.nextInt();

        if (nota>= 8){
            System.out.println("Você foi APROVADO");
        } else if (nota >= 6) {
            System.out.println("Você está de RECUPERAÇÃO");
        }else {
            System.out.println("Você foi REPROVADO");
        }
        sc.close();
    }
}
