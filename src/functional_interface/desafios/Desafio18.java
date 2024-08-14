package functional_interface.desafios;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    /*
Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1);

        boolean tudoIgual = numeros.stream().allMatch(numeros.get(0)::equals);

        System.out.println(tudoIgual ?
                "Todos os elementos da lista são iguais" :
                "Pelo menos um elemento é diferente do outro na lista");
    }
}
