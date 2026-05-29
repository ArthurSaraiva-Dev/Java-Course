package estruturasdecontrole.desafios;

import javax.swing.*;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // Calcular média das notas de uma turma
        // O usuário digita uma nota válida, que contabiliza em um total
        // Contabiliza o número de alunos para fazer a média

        try (Scanner entrada = new Scanner(System.in)){
            System.out.println("=== SISTEMA CAPTAÇÃO DE MÉDIA ===");

            int quantDeNotas = 0;
            double nota = 0;
            double total = 0;

            while (nota != -1){
                System.out.print("\nInforme a nota: (Ou -1 para sair)");
                nota = entrada.nextDouble();

                if (nota <= 10 && nota >= 0){
                total += nota;
                quantDeNotas++;
                }else if (nota != -1){
                    System.out.print("\nDigite uma nota válida!");
                }
            }

            // Calculando a média
            double media = total / quantDeNotas;
            System.out.printf("\nA média da turma é: %.1f", media);
        }



    }
}
