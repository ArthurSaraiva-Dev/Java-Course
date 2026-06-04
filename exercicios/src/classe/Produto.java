package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Double precoComDesconto (double descontoDoGerente){
        return preco - (preco * (desconto + descontoDoGerente));
    }

}
