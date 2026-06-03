package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto(); // Utilizando a Classe Produto
        p1.nome = "SSD KINGSTON 512GB";
        p1.preco = 479.80;
        p1.desconto = 0.15;

        var p2 = new Produto(); // Produto() é o constructor
        p2.nome = "Notebook";
        p2.preco = 6789.90;
        p2.desconto = 0.20;

        double precoFinal1 = p1.preco - (p1.preco * p1.desconto);
        double precoFinal2 = p2.preco - (p2.preco * p2.desconto);

        System.out.printf("Produto: %s\n" +
                "Valor final (com desconto): R$%.2f\n" +
                "Desconto Aplicado: %.0f%%" // O "%%" exibe o caractere sem conflitar com o printf.
                , p1.nome, precoFinal1, p1.desconto * 100);

        System.out.printf("\nProduto: %s\n" +
                "Valor final (com desconto): R$%.2f\n" +
                "Desconto Aplicado: %.0f%%" // O "%%" exibe o caractere sem conflitar com o printf.
                , p2.nome, precoFinal2, p2.desconto * 100);



    }
}
