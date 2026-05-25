package fundamentos.operadores;

public class Unarios {
    static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1; posfix
        a--; // a = a - 1; posfix

        ++b; // b = b + 1; prefix
        --b; // b = b - 1; prefix

        System.out.println(a);
        System.out.println(b);

        System.out.println("Resposta");
        System.out.println(++a == b--);

        System.out.println(a);
        System.out.println(b);


    }
}
