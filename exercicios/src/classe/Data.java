package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFromatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
