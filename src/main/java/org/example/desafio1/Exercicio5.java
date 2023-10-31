package org.example.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    /*Faça um algoritmo que receba uma lista de número e retorne a
    mesma lista ordenada de forma decrescente (maior para o menor).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.print("Digite os numeros que deseja" +
                "(para sair digite 0):");
        int numero;
        do {
            numero = sc.nextInt();
            if (numero != 0){
                num.add(numero);
            }
        } while (numero != 0);

        //ordenando a lista de forma decrescente
        Collections.sort(num, Collections.reverseOrder());

        //imprimindo a lista decrescemte
        System.out.print("Lista ordenada em ordem decrescente:");
        for (int i : num){
            System.out.println(i);
        }
    }
}
