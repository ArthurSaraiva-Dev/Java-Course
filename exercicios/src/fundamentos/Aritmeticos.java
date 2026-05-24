package fundamentos;

public class Aritmeticos {
    static void main(String[] args) {
        var x = 34.89;
        double y = 2.2;

        int a = 8;
        int b = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        System.out.println(a + b); // Adição
        System.out.println(a - b); // Subtração
        System.out.println(a * b); // Multiplicação
        System.out.println(a / b); // Divisão
        System.out.println(a / (double) b); // CASTING PARA MELHOR PRECISÃO

        // Módulo
        System.out.println(a % b); // Resto da divisão

    }
}
