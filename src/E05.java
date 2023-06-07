//5. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------- Operação Matemática -----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\nDigite 20 números inteiros e eu te direi quantos estão entre 0 e 100. ");

        int[] numeros = new int[20];
        List<Integer> numerosNoIntervalo = new ArrayList<>();
        int qntNumeros = 0;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o %dª número: ", (i + 1));
            numeros[i] = entradaDoUsuario.nextInt();

            if (numeros[i] >= 0 && numeros[i] <= 100) {
                numerosNoIntervalo.add(numeros[i]);
                qntNumeros++;
            }
        }
        System.out.printf("Os números são: " + numerosNoIntervalo + "\n " + qntNumeros + "estão no intervalo de 0 a 100");
    }
}

//CHECKLIST DE MELHORIAS:
// validação de entrada (erro ao escrever palavras, valor decimal, etc);
// Lidar com mais ou menos de 20 numeros;
//