package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }
    }

    String apresentar(){
        return String.format("Olá eu sou o %s e tenho %.1f Kgs", this.nome, this.peso);
    }
}
