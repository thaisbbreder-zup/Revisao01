//8. Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
// Após toda a entrada ter sido realizada, leia o valor de um reajuste.
// Em seguida exiba todos os salários já reajustados.
//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------- REAJUSTE SALARIAL -----------------------------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\nDigite quantos SALÁRIOS voce quiser e farei o reajuste de 10% de todos eles para voce! ");
        System.out.println("Para SAIR basta digitar -1, ok? Vamos começar!!!\n ");

        List<Double> listaSalarios = new ArrayList<>();
        List<Double> listaSalariosReajustados = new ArrayList<>();
        double salario = 0;
        double salarioReajustado = 0;
        double reajuste = 0;
        boolean informaSalario = true;

        do {
            System.out.print("Digite o salário: ");
            salario = entradaDoUsuario.nextDouble();

            if (salario >= 0) {
                listaSalarios.add(salario);

                System.out.print("Digite o valor do reajuste em porcentagem (digite apenas o número): ");
                reajuste = entradaDoUsuario.nextDouble();

                salarioReajustado = salario + (salario * (reajuste / 100));
                listaSalariosReajustados.add(salarioReajustado);

            } else {
                break;
            }
        } while (informaSalario);

        System.out.println("\n--------------------------------------------------");
        System.out.println("|   Salário Original   |   Salário Reajustado   |");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < listaSalarios.size(); i++) {
            System.out.printf("|   %.2f              |   %.2f                |\n", listaSalarios.get(i), listaSalariosReajustados.get(i));
        }
        System.out.println("--------------------------------------------------");
    }
}


