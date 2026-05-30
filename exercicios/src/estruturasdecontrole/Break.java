package estruturasdecontrole;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break; // para quando i chega a 5
            }
            System.out.println(i); // E vai para fora do laço
        }
    }
}
