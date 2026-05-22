package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("FEIJÃO"); // printa sem pular linha ao fim
        System.out.print(" COM FARINHA");

        // A linha criada pelo println somente é iniciada após a string "Inglês"
        System.out.println("inglês"); 

        // Coleta infos
        try (Scanner entrada = new Scanner(System.in)){ // prática moderna para o scanner


        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); // CAPTURA STRINGS
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine(); // CAPTURA STRINGS

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // CAPTURA INTEIROS

        System.out.print("Digite seu salario: ");
        double salario = entrada.nextDouble(); // CAPTURA DE PONTO FLUTUANTE
        
        System.out.printf("\nO %s %s, tem %d de idade. \n%s recebe %.2f", nome, sobrenome, idade, nome, salario);
        }
    }
}
