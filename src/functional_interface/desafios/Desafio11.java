package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Desafio11 {
    /*
    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .map(n -> n * n)
                .toList() //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 25, 16, 9]
                .stream().reduce(0, Integer::sum);

        System.out.println("A soma dos quadrados é " + soma); //435
    }
}
