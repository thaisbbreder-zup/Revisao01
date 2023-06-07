//7. Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------- IMPRIMA O NOME N VEZES ----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entradaDoUsuario.nextLine();

        System.out.println("Quantas vezes vocë quer imprimir o seu nome?");
        int qnt = entradaDoUsuario.nextInt();

        for (int i = 0; i < qnt; i++) {
            System.out.println(nome);
        }
    }
}
