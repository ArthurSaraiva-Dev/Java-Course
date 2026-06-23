package arrays.desafios;

import javax.swing.*;

public class MediaAluno {
    public static void main(String[] args) {
        String quantNotas = JOptionPane.showInputDialog("=== Calculadora de médias ===\n" +
                "Digite a quantidade que deseja adicionar:");

        double notas[] = new double[Integer.parseInt(quantNotas)];

        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            String notaString = JOptionPane.showInputDialog("Digite a nota " + i + 1 + ":");
            double nota = Double.parseDouble(notaString);
            notas[i] = nota;
        }

        for (double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.printf("A média do aluno é: %.1f", media);
    }
}
