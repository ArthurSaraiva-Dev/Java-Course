package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuoção por valor (Tipo Primitivo)

        Data d1 = new Data(1, 5, 2026);
        Data d2 = d1; // Atribuição por Referência (Objeto)

        d1.dia = 30;
        d2.mes = 7;

        System.out.println(d1.obterDataFromatada());
        System.out.println(d2.obterDataFromatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFromatada());
        System.out.println(d2.obterDataFromatada());

        int c = 7;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
        // Não gera impacto em tipos primitivos.
    }
}
