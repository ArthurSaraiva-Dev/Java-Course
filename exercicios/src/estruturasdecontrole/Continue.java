package estruturasdecontrole;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue; // Interrompe e continua
            }
            System.out.println(i);
        }
    }
}
