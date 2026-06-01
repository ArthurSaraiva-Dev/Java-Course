package estruturasdecontrole.exerciciosdeconclusão;

import javax.swing.*;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        try(Scanner entrada = new Scanner(System.in)){
            int maiorValor = 0;
            int contador = 0;

            do {
                System.out.println("Digite um número");
                int valor = entrada.nextInt();
                if (valor > maiorValor){
                    maiorValor = valor;
                }

                contador++;
            }while (contador != 10);

            System.out.printf("O maior valor é: %d", maiorValor);
        }



    }
}
