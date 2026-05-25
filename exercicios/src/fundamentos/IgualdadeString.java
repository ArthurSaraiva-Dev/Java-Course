package fundamentos;

import java.util.Scanner;

public class IgualdadeString {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String s1 = new String("2");

        String s = entrada.next(); // O next() remove os espaços em braco
        System.out.println("2" == s1.trim()); // errado
        System.out.println("2".equals(s1.trim())); // O trim() remove os espaços em branco

        entrada.close();
    }
}
