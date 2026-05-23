package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
    static void main(String[] args) {
       // Desafio média de salários

        // Abrindo Scanner
        Scanner entrada = new Scanner(System.in);

        //Definindo variáveis
        System.out.println("=== Calculando a média salarial ===");

        System.out.println("Digite o primeiro salário: ");
        String salarioString1 = entrada.nextLine().replace(',', '.');

        System.out.println("Digite o segundo salário: ");
        String salarioString2 = entrada.nextLine().replace(',', '.');

        System.out.println("Digite o terceiro salário: ");
        String salarioString3 = entrada.nextLine().replace(',', '.');

        double s1 = Double.parseDouble(salarioString1);
        double s2 = Double.parseDouble(salarioString2);
        double s3 = Double.parseDouble(salarioString3);

        double media = s1 + s2 + s3 / 3;

        System.out.printf("A média salárial é: %.2f", media);

        entrada.close();
    }
}
