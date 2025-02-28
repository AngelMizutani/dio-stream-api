package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
/*
Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();
        System.out.println("Numeros maiores que 5: " + numerosMaioresQueCinco); //6, 7, 8, 9, 10

        int soma = numerosMaioresQueCinco.stream()
                .reduce(0, Integer::sum);

        System.out.println("A média dos números maiores que cinco é " + soma/numerosMaioresQueCinco.size()); //8

    }
}
