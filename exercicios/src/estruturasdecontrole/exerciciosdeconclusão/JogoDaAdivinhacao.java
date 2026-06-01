package estruturasdecontrole.exerciciosdeconclusão;

import javax.swing.*;
import java.util.Random;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        // Jogo da adivinhação

        // Gerando número aleatório
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);

        for (int jogadasRestantes = 10; jogadasRestantes >= 0; jogadasRestantes--) {
            String numeroDigitaString = JOptionPane.showInputDialog("Digite um número de 0 a 100");
            int numeroDigitado = Integer.parseInt(numeroDigitaString);
            System.out.println(numeroAleatorio);

            if (numeroDigitado > 100 || numeroDigitado < 0){
                JOptionPane.showMessageDialog(null, "Número inválido. Digite novamente.");
            }else if (jogadasRestantes == 0){
                JOptionPane.showMessageDialog(null, "O jogo acabou. O número correto era: "
                        + numeroAleatorio);
            } else if(numeroDigitado != numeroAleatorio){
                JOptionPane.showMessageDialog(null, "ERROU! Você tem mais "
                        + jogadasRestantes + " jogadas restantes. Tente novamente.");
            } else if (numeroDigitado == numeroAleatorio) {
                JOptionPane.showMessageDialog(null,"VOCÊ GANHOU!!");
                break;
            }
        }
        JOptionPane.showMessageDialog(null,"Fim!");



    }
}
