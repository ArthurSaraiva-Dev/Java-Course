package estruturasdecontrole;

import javax.swing.*;

public class SwitchComBreak {
    public static void main(String[] args) {
        String notaString = JOptionPane.showInputDialog("Digite a sua nota!");
        int nota = Integer.parseInt(notaString);

        if (nota > 10 || nota < 0){
            notaString = JOptionPane.showInputDialog("Digite uma nota Válida!");
            nota = Integer.parseInt(notaString);
        }

        String conceito = "";

        switch (nota){
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
                conceito = "D";
                break;
            case 3:
            case 2:
                conceito = "E";
                break;
            case 1:
            case 0:
                conceito = "F";
                break;
            default:
                System.out.println("Não informado.");
        }
        System.out.printf("O Conceito é: %s", conceito);
    }

}
