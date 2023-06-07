import java.util.Scanner;

public class E04 {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------- MÉDIA DAS IDADES -----------------------------------");

        System.out.println("\n Digite a idade de 20 pessoas para descobrir a média etária.");

        Scanner entradaDoUsuario = new Scanner(System.in);
        int[] idades = new int[20];
        double mediaEtaria = 0;
        double soma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite a idade da %dª  pessoa: ", (i + 1));
            idades[i] = entradaDoUsuario.nextInt();
        }

        for (int i=0; i < idades.length; i++){
          soma += idades[i];
        }

      mediaEtaria =  soma  / idades.length;
        System.out.println("A média de idades é " + mediaEtaria);
    }
}
