package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    /*
    Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números da lista é " + soma); //67
    }
}
