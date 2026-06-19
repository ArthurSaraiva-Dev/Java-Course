package classe;


public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";

        System.out.println(s1.concat("!!!"));

        Data d1 = (Math.random() > 0.5) ? new Data() : null; // Apontando para NULO e não para um endereço na memória
        if (d1 != null){
            System.out.println(d1.obterDataFromatada());
        }

        // String s2; Erro de compilação irá ocorrer
        String s2 = (Math.random() > 0.5) ? "Salve" : null; // Agora essa string foi inicializada
        if (s2 != null){
            System.out.println(s2.concat("!!!")); // Erro de Runtime (NullPointerException)
        }


    }
}
