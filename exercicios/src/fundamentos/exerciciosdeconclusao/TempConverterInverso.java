package fundamentos.exerciciosdeconclusao;

import javax.swing.*;

public class TempConverterInverso {
    public static void main(String[] args) {
        String entradaC = JOptionPane.showInputDialog("Digite a temperatura em °C");

        double celsius = Double.parseDouble(entradaC);

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("A temperatura %.1f°C equivale à %.1f°F.", celsius, fahrenheit);
    }
}
