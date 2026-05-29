package estruturasdecontrole;

import javax.swing.*;

public class WhileIndeterminado {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite qualquer coisa. Para sair, digite (Sair)")
                .trim().toLowerCase();

        // Definindo o loop
        while (!entrada.equals("sair")){
            entrada = JOptionPane.showInputDialog("Digite qualquer coisa novamente. Para sair, digite (Sair)");
        }
        
    }
}
