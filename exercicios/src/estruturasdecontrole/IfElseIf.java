package estruturasdecontrole;

import javax.swing.*;

public class IfElseIf {
    public static void main(String[] args) {
        String notaString = JOptionPane.showInputDialog("Digite a nota do aluno: ").replace(',', '.');

        double nota = Double.parseDouble(notaString);

        // validando erros
        if(nota > 10 || nota < 0){
            System.out.println("Nota Inválida!");
        }

        if (nota <= 10 && nota >= 8.1){
            System.out.println("Aluno nota: A");
        }else if (nota <= 8.0 && nota >= 6.5){
            System.out.println("Aluno nota: B");
        }else if (nota <= 6.5 && nota >= 5.0){
            System.out.println("Aluno nota: C");
        }else if (nota <= 5.0 && nota >= 4.0){
            System.out.println("Aluno nota: D");
        }else if (nota <= 4.0 && nota >= 2.5){
            System.out.println("Aluno nota: E");
        }else if (nota <= 2.5 && nota >= 0){
            System.out.println("Aluno nota: F");
        }


    }
}
