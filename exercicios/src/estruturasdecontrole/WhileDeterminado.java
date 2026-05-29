package estruturasdecontrole;

public class WhileDeterminado {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10){ // WHILE DETERMINADO PELO CONTADOR
            System.out.printf("contador: %d\n", contador);
            contador++; // A CADA REPETIÇÃO, O CONTADOR INCREMENTA MAIS 1 A ELE MESMO.
        }

    }
}
