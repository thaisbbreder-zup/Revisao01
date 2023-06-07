//  Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
//  caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para
//  uma variável C e mostrar seu conteúdo na tela.

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------- Operação Matemática -----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\nDigite dois valores. Se eles forem iguais, serão somados, senão serão multiplicados ");

        System.out.print("Primeiro valor: ");
        int primeiro = entradaDoUsuario.nextInt();

        System.out.print("Segundo valor: ");
        int segundo = entradaDoUsuario.nextInt();

        int resultado = (primeiro == segundo) ? primeiro + segundo : primeiro * segundo;
        System.out.printf("O resultado final é %d", resultado);
    }

}

