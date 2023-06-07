//2. Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
// imprimir o resultado desta operação.

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------- Operação Matemática -----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\nDigite um número. Se ele for par, será somado 5; se for ímpar, será somado 8.");
        double numero = entradaDoUsuario.nextDouble();

       double resultado = (numero % 2 == 0) ? numero + 5 : numero + 8;
        System.out.println("O resultado da operação é  " + resultado);
    }
    }
