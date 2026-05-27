package fundamentos.desafios;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //Ler num1
        //Ler num2
        // + - * / %

        // Capturando dados
        String num1String = JOptionPane.showInputDialog("Digite o primeiro número para calculo");
        String num2String = JOptionPane.showInputDialog("Digite o segundo número para calculo");
        String operador = JOptionPane.showInputDialog("Digite a operação que deseja [+ - / * %]");

        // Tratando os dados
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);

        //Calculando
        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        // Exibindo
        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
    }
}
