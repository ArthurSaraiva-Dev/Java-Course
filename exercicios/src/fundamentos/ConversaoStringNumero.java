package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro Número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo Número:");

        double n1 = Double.parseDouble(valor1);
        double n2 = Double.parseDouble(valor2);

        double soma = n1 + n2;


        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma / 2);
    }
}
