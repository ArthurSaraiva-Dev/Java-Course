package fundamentos;

public class ConversaoTipoPrimitivosNumericos {
    static void main() {
        // Fugir ao máximo do CAST

        double a = 1; // Implícita
        System.out.println(a);

        float b = (float) 54654365436534.0; // Conversão Explicita (CAST) (pode haver perda de info)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // CAST
        System.out.println(d); // Neste caso, dará 84. Pois o byte retorna para -127 e vai contando.

        double e = 1.99999;
        int f = (int) e; // CAST
        System.out.println(f);
    }
}
