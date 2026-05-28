package estruturasdecontrole.desafios;

import javax.swing.*;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Digite um dia da semana (Ex: Terça)")
                .replace('ç','c').toLowerCase().trim();

        if (dia.equals("segunda")){
            System.out.println("1");
        } else if (dia.equals("terca")) {
            System.out.println("2");
        } else if (dia.equals("quarta")) {
            System.out.println("3");
        } else if (dia.equals("quinta")) {
            System.out.println("4");
        } else if (dia.equals("sexta")) {
            System.out.println("5");
        } else if (dia
                .replace("sábado", "sabado")
                .equals("sabado")) {
            System.out.println("6");
        } else if (dia.equals("domingo")) {
            System.out.println("7");
        }

    }
}
