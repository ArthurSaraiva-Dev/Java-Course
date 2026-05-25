package fundamentos.operadores;

public class Ternarios {
    static void main(String[] args) {
        double media = 8.9;

        String resultado = media >= 7.0 ? "Passou" : "Recuperação";

        System.out.println("O aluno está: " + resultado);

        double nota = 7.7;
        boolean bomComportamento = true;
        boolean passouMedia = nota > 7;
        boolean temDesconto = bomComportamento && passouMedia;

        String resultadoDesconto = temDesconto ? "Sim" : "Não";
        System.out.printf("Tem desconto? %s", resultadoDesconto);
    }
}
