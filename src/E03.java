/*
3. Escreva um algoritmo que leia o número de identificação,
as 3 notas obtidas por um aluno nas 3 verificações
e a média dos exercícios que fazem parte da avaliação,
e calcule a média de aproveitamento, usando a fórmula:
MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
A atribuição dos conceitos obedece a tabela abaixo.
O algoritmo deve escrever o número do aluno, suas notas,
a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado'
se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E
*/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class E03 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------- MÉDIA FINAL DOS ALUNOS ----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);
        boolean calculoMedia = true;
        List<Double> listanotas = new ArrayList<>();
        List<String> listaConceitos = new ArrayList<>();
        List<String> listaIdentificador = new ArrayList<>();
        List<Double> listaMedia = new ArrayList<>();

        double notas = 0;
        String conceito = null;
        String identificador = null;
        double media = 0;
        double somaNotas = 0;
        double mediaExercicios = 0;
        String letraConceito = null;


        System.out.print("Digite o identificador do aluno: ");
        identificador = entradaDoUsuario.next();
        listaIdentificador.add(identificador);


        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a nota %d do aluno: ", (i + 1));
            notas = entradaDoUsuario.nextDouble();
            listanotas.add(notas);
        }

        System.out.print("Digite a média dos exercícios: ");
        mediaExercicios = entradaDoUsuario.nextDouble();

        media = (listanotas.get(0) + listanotas.get(1) * 2 + listanotas.get(2) * 3 + mediaExercicios) / 7;
        listaMedia.add(media);

        if (media >= 90) {
            conceito = " Aprovado com conceito A";
        } else if (media >= 75 && media < 90) {
            conceito = " Aprovado com conceito B";
        } else if (media >= 60 && media < 75) {
            conceito = " Aprovado com conceito C";
        } else if (media >= 40 && media < 60) {
            conceito = " Reprovado com conceito D";
        } else {
            conceito = " Reprovado com conceito E";
        }
        listaConceitos.add(conceito);
        System.out.println("--------------------------------------------------------------");
        System.out.println("\nAluno: " + identificador + "\nNotas: " + listanotas + "\nMédia dos exercícios: " + mediaExercicios + "\nMédia: " + media + "\nConceito: " + conceito);
    }
}
