package functional_interface.desafios;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    /*
Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
  */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> BigInteger.valueOf(n).isProbablePrime(1))
                .forEach(System.out::println); //[2, 3, 5, 7, 5, 3]
    }
}
