package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){} // Construtor Padrão

    Produto(String nomeInicial, double precoInicial, double descontoInicial){ // Construtor
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }



    Double precoComDesconto (double descontoDoGerente){
        return preco - (preco * (desconto + descontoDoGerente));
    }

}
