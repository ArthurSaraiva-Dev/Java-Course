package arrays;

import javax.swing.*;

public class Matriz {
    public static void main(String[] args) {
    // Média da Turma
    String inputAlunos = JOptionPane.showInputDialog("Digite o número de alunos da Turma:");
    String inputNotas = JOptionPane.showInputDialog("Digite o número de notas de cada aluno:");

    int nAlunos = Integer.parseInt(inputAlunos);
    int nNotas = Integer.parseInt(inputNotas);

        double[][] turma = new double[nAlunos][nNotas];

        double notaTotal = 0;
        for (int a = 0; a < turma.length; a++) {
            for (int n = 0; n < turma[a].length; n++) {
                String nota = JOptionPane.showInputDialog
                        (String.format("Informe a nota %d do aluno %d:", n + 1, a + 1));
                turma[a][n] = Double.parseDouble(nota);
                notaTotal += turma[a][n];
            }
        }

        double media = notaTotal / (nAlunos * nNotas);
        JOptionPane.showMessageDialog(null, String.format("A média final da turma é: %.1f", media));

    }
}
