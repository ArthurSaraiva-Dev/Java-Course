package fundamentos;

public class Tiposprimitivos {
    public static void main(String[] args){
        //Infos do funcionário

        //Tipos inteiros
        byte anosDeEmpresa = 27;
        short nDeVoos = 532;
        int id = 4756453;
        long pontosAcumulados = 1_222_132_434L; // O uso do "L" ao fim, o numero deixa de ser um int 

        // Tipos numérios reais
        float salario = 22_540.33F; // Indica que está escrevendo um literal FLOAT
        double vendasAcumuladas = 2_435_466_756.02;

        // Tipo Booleano
        boolean estaDeFerias = true; // true ou false
        
        // Tipo Caractere
        char status = 'A'; // Somente armazena 1 caracter
        // Com o char também é possível utilizar a tabela unicode


        //DIAS DE EMPRESA
        System.out.println("Este funcionário tem: " + anosDeEmpresa * 365 + " dias de casa.");
        
        // NÚMERO DE VIAGENS
        System.out.println("Ele voou: " + nDeVoos / 2);

        //ID + SALÁRIO
        System.out.println("O funcionário sob ID: " + id + " Ganha: R$"  + salario);

        // PONTOS POR REAL
        System.out.println("Em todos esses anos acumulou: " + pontosAcumulados / vendasAcumuladas + " pontos por real");

        // FERIAS
        System.out.println("O funcionário está de férias?" + estaDeFerias);

        // Atividade
        System.out.println("O funcionário está ativo? " + status);

    }
}
