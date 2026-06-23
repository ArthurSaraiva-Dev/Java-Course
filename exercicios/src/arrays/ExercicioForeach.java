package arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {
        double notasAlunoA[] = new double[5]; // inicializando vazio
        // SEMPRE QUE VAZIO, IRÁ RETORNAR O VALOR PADRÃO DO TIPO. 0.0 NESSE CASO.
        System.out.println(Arrays.toString(notasAlunoA));

        // ISERINDO VALORES POR INDICE SEPARADAMENTE
        notasAlunoA[0] = 6.8;
        notasAlunoA[1] = 8.9;
        notasAlunoA[2] = 5.2;
        notasAlunoA[3] = 1.3;
        notasAlunoA[4] = 9.4;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]); // Retornando PRIMEIRA NOTA
     // System.out.println(notasAlunoA[5]); ERRO! ArrayIndexOutOfBoundsException
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); // Retornando ULTIMA NOTA

        double totalAlunoA = 0;
        for (double nota: notasAlunoA) { // VARRENDO ARRAY COM FOREACH
            totalAlunoA += nota;
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        double [] notasAlunoB =  {6.9, 4.7, 3.2, 4.1, 10, 6}; // INICIANDO JÁ COM OS VALORES

        double totalaAlunoB = 0;
        for (double nota: notasAlunoB) {
            totalaAlunoB += nota;
        }
        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(totalaAlunoB / notasAlunoB.length);
    }
}
