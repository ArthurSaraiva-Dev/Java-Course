package fundamentos.exerciciosdeconclusao;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        //CAPTURANDO DADOS
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        String pesoString = entrada.next();

        System.out.println("Digite sua altura: ");
        String alturaString = entrada.next();

        //TRATANDO DADOS
        double peso = Double.parseDouble(pesoString);
        double altura = Double.parseDouble(alturaString);

        //CALCULANDO
        double resultado = peso / Math.pow(altura, 2);

        //EXIBINDO
        System.out.printf("Seu IMC é: %.1f", resultado);

        entrada.close();
    }
}
