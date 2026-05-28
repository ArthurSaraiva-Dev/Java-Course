package estruturasdecontrole;

import java.time.Year;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0){
            System.out.print("\nO aluno passou.");
            System.out.print("\nParabéns!");
        }

        if (media < 7.0 && media >= 5.0){
            System.out.println("Aluno de Recuperação.");
        }

        if (media < 5.0 && media >= 0){
            System.out.println("Aluno reprovado.");
        }


        entrada.close();
    }
}
