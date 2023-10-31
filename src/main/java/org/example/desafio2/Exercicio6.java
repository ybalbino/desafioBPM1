package org.example.desafio2;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio6 {
/*  Descrição: Escreva um algoritmo que receba um valor N
e retorne o seu fatorial (N!)
 */
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    try {
        System.out.print("Digite um valor inteiro (0 < N < 13): ");
        int n = leitor.nextInt();

        if (n < 0 || n >= 13) {
            throw new IllegalArgumentException("O valor de N deve estar no intervalo válido (0 < N < 13).");
        }

        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fat);
    } catch (java.util.InputMismatchException e) {
        System.err.println("Erro: Por favor, insira um valor inteiro válido.");
    } catch (IllegalArgumentException e) {
        System.err.println("Erro: " + e.getMessage());
    }
}
}


