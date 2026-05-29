package estruturasdecontrole;

import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
        String entrada = "";

        do { // Faça
            entrada = JOptionPane.showInputDialog("Você precisa dizer as palavras mágicas...\n" +
                    "Quer sair?").trim().toLowerCase();
        }while (!entrada.equals("por favor")); // Enquanto
        


    }
}
