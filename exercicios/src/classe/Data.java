package classe;

public class Data {
    int dia;
    int mes;
    int ano;



    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoIncial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoIncial;
    }

    String obterDataFromatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
