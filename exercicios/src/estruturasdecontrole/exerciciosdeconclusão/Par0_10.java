package estruturasdecontrole.exerciciosdeconclusão;

import javax.swing.*;

public class Par0_10 {
    public static void main(String[] args) {
        int num = 0;

        do {
            String entradaString = JOptionPane.showInputDialog("Digite um número inteiro: (digite -1 para sair)");
            num = Integer.parseInt(entradaString);

            if (num == -1){
                System.out.println("Saindo...");
            }else if (num < 0 || num > 10){
                System.out.println("O número digitado está fora do range de 0 a 10! Digite novamente!\n");
            }else if(num % 2 == 0){
                System.out.printf("O número [%d] é par\n",num);

            }else{
                System.out.printf("O número [%d] é ímpar\n",num);
            }
        }while(num != -1);



    }
}
