package estruturasdecontrole;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valorS = JOptionPane.showInputDialog("Digite um valor:");

        int valor = Integer.parseInt(valorS);

        if (valor % 2 == 0){
            System.out.print("O número digitado é par!");
        }else {
            System.out.print("O número digitado é ímpar!");
        }


    }
}
