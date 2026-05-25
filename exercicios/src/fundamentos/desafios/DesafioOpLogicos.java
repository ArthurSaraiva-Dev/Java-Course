package fundamentos.desafios;

public class DesafioOpLogicos {
    static void main(String[] args) {
        // Trabalho terça (V OU F)
        // Trabalho quinta (F OU F)

        // V && V = TV DE 50" + SORVETE
        // V || F = TV DE 32 + SORVETE
        // F && F = MAIS SAUDAVEL - SORVETE

        boolean trabalhoTer = true;
        boolean trabalhoQuin = true;

        boolean tv50 = trabalhoQuin && trabalhoTer;
        System.out.println("Comprou Tv de 50\"? " + tv50);

        boolean tv32 = trabalhoQuin ^ trabalhoTer;
        System.out.println("Comprou Tv de 32\"? " + tv32);

        boolean sorvete = trabalhoQuin || trabalhoTer;
        System.out.println("Tomaram sorvete? " + sorvete);

        boolean saude = !sorvete;
        System.out.println("Estão saudáveis? " + saude);




    }
}
