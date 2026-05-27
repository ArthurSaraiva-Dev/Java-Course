package fundamentos.exerciciosdeconclusao;

import javax.swing.*;

public class TempConverter {
    public static void main(String[] args) {
        final double  AJUSTE = 32.0;
        final double FATOR = 5.0/9.0;

        // CAPTURANDO DADOS
        String entradaf = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:");

        // TRATANDO DADOS
        double fahrenheit = Double.parseDouble(entradaf);

        double c = (fahrenheit - AJUSTE) * (FATOR);

        System.out.printf("A temperatura %.1f°F equivale à %.1f°C.", fahrenheit, c);
    }
}
