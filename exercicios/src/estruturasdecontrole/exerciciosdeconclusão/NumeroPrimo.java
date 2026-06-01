package estruturasdecontrole.exerciciosdeconclusão;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("Digite um número para conferência de número primo:");
            int numero = entrada.nextInt();
            int contadorDeDivisores = 0;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0){
                    contadorDeDivisores++;
                }
            }
            switch (contadorDeDivisores){
                case 0:
                    System.out.printf("O número digitado [%d], é primo.", numero);
                    break;
                default:
                    System.out.printf("O número digitado [%d], não é primo.", numero);
            }

        }
    }
}
