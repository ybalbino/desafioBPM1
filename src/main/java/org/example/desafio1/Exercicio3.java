package org.example.desafio1;

import java.util.Scanner;

public class Exercicio3 {
    /*Faça um algoritmo que receba uma letra e
    retorne se a letra informada é vogal ou consoante.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra e vou te falar se é uma vogal: ");
        char letra = sc.next().toLowerCase().charAt(0); // converte a letra para minuscula(toLowerCase)

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra '" + letra + "' é uma vogal.");
        } else {
            System.out.println("A letra '" + letra + "' não é uma vogal.");
        }

        sc.close();
    }
}

