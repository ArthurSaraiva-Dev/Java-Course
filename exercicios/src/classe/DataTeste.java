package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 22;
        d1.mes = 07;
        d1.ano = 2004;

        Data d2 = new Data();
        d2.dia = 29;
        d2.mes = 10;
        d2.ano = 2005;

        System.out.printf("%d/%d/%d\n", d1.dia,d1.mes,d1.ano);
        System.out.printf("%d/%d/%d\n", d2.dia,d2.mes,d2.ano);

    }

}
