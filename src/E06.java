//6. Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
// Encerre a execução quando um número negativo for digitado.
//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------- Operação Matemática -----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\nDigite quantos números voce quiser e eu te direi a soma deles. ");
        System.out.println("Para SOMAR basta digitar um número negativo (ele não entrará no calculo, ok? Vamos começar!!!\n ");

        List<Double> listaNumeros = new ArrayList<>();
        double numero = 0;
        double soma = 0;
        do {
            System.out.print("Digite um número: ");
            numero = entradaDoUsuario.nextDouble();

            if (numero >= 0) {
                listaNumeros.add(numero);
                soma += numero;
            } else {
                System.out.println("OK! Vocë digitou um números negativo para realizar a soma. ");
            }

        } while (numero >= 0);
        System.out.println("\nOs números digitados foram: " + listaNumeros);
        System.out.println("Resultado da soma: " + soma);
    }
}
