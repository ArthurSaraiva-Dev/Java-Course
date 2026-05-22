package fundamentos;

public class ConversaoTipoPrimitivosString {
    static void main() {
        Integer n1 = 10000;
        System.out.println(n1.toString().length());

        int n2 = 10000;
        System.out.println(Integer.toString(n2)); // Utilizando valor primitivo

        System.out.println("" + n2); // nunca utilizar (nada convencional
    }
}
