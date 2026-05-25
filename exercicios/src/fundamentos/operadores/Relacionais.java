package fundamentos.operadores;

public class Relacionais {
    static void main(String[] args) {
        int a = 97;
        int b = 'a'; // na base decimal, a significa 97

        System.out.println(a == b); // true

        System.out.println(4 > 7); // false
        System.out.println(3 >= 3); // true
        System.out.println(3 < 9); // true
        System.out.println(30 <= 9); // false
        System.out.println(30 != 9); // true

        double nota = 4.7;
        boolean bomComportamento = true;
        boolean passouMedia = nota > 7;
        boolean temDesconto = bomComportamento && passouMedia;

        System.out.printf("Tem desconto? %b", temDesconto);

    }
}
