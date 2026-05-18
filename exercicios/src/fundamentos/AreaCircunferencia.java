package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3; // a variável "double" armazena valores de ponto flutuante (valores quebrados)
        
        final double PI = 3.14159; // "final" define que o "double" será constante
        // Por convenção, constantes se escrevem em caixa alta
        
        double area = PI * raio * raio; 
        System.out.println(area);

        raio = 11;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2"); // Concatenação 
    }
}
