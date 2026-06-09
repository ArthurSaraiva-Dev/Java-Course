package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){} // Construtor Padrão

    Produto(String nomeInicial, double precoInicial){ // Construtor
        nome = nomeInicial;
        preco = precoInicial;
    }

    Double precoComDesconto (){
        return preco - (preco * (desconto));
    }



}
