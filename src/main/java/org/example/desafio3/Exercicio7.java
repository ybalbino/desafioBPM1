package org.example.desafio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class Exercicio7 {
    /*
  Descrição: Você deve calcular o consumo médio de um automóvel onde será informada a
  distância total percorrida (em Km) e o total de combustível consumido (em
  litros).
  - Entrada
  Você receberá dois valores: um valor inteiro X com a distância total percorrida
  (em Km, e um valor real Y que representa o total de combustível consumido, com
  um dígito após o ponto decimal.
  - Saída
  Exiba o valor que representa o consumo médio do automóvel (3 casas após a
  vírgula), incluindo no final a mensagem "km/l".
*/
    public static void main(String[] args) {
        try {
            BigDecimal km;
            BigDecimal combustivel;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Informe a distância total percorrida (Km): ");
            km = new BigDecimal(br.readLine());

            System.out.print("Informe o total de combustível consumido (L): ");
            combustivel = new BigDecimal(br.readLine());

            BigDecimal comMedio = km.divide(combustivel, MathContext.DECIMAL32).setScale(3, BigDecimal.ROUND_HALF_EVEN);

            System.out.println("Consumo médio: " + comMedio + " km/l");
        } catch (IOException e) {
            System.err.println("Erro de E/S: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato: Certifique-se de inserir números válidos.");
        }
    }
}

