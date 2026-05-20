package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        // TIPOS PRIMITIVOS NÃO UTILIZAM NOTAÇÃO PONTO
        
        String s = "feijão com farinha";
        
        s = s.replace("farinha", "crack");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
    }
}
