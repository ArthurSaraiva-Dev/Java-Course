package arrays;

public class Foreach {
    public static void main(String[] args) {
        double notas[] = {8.7, 5.5, 2.7, 9.4, 7.3};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nForeach:");
        for(double nota: notas){ // Para cada NOTA in NOTAS
            System.out.print(nota + " ");
        }
    }
}
