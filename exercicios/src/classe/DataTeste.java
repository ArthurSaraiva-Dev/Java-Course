package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(); // DATA DEFINICA PADRÃO 1/1/1970
        //d1.dia = 1;
        //d1.mes = 1;
        //d1.ano = 1970;

        Data d2 = new Data(22, 7,2004); // Utilizando Constructor
        //d2.dia = 22;
        //d2.mes = 7;
        //d2.ano = 2004;

        //System.out.printf("%d/%d/%d\n", d1.dia,d1.mes,d1.ano);
        //System.out.printf("%d/%d/%d\n", d2.dia,d2.mes,d2.ano);

        System.out.println(d1.obterDataFromatada());
        System.out.println(d2.obterDataFromatada());

    }

}
