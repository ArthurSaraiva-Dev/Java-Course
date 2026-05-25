package fundamentos.operadores;

public class Atribuicao {
    static void main(String[] args) {
        int a = 6;
        int b = a;
        int c = a + b;

        c += b; // c = c + b;
        c -= a; // c = c - a;
        c *= b; // c = c * b;
        c /= a; // c = c / a;

        System.out.println(c);
        c %= 2; // c = c % 2; 0 ou 1
        System.out.println(c);

    }
}
