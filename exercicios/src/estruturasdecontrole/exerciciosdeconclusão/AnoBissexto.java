package estruturasdecontrole.exerciciosdeconclusão;

import javax.swing.*;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano = 0;
        System.out.println("VEFIRICAÇÃO DE ANO BISSEXTO");
        do {
            String entradaString = JOptionPane.showInputDialog("Digite um ano para verificar: (digite -1 para sair)");
            ano = Integer.parseInt(entradaString);

            if (ano < 1000){
                System.out.println("Ano inválido, digite novamente.");
            }else if(ano % 4 == 0){
                System.out.printf("Ano %d é Bissexto\n", ano);
            }else{
                System.out.printf("O ano %d não é bissexto\n", ano);
            }

        }while(ano != -1);
    }
}
