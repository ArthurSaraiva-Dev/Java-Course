package classe.desafio;

import javax.swing.*;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Feijão", 0.888);
        Comida c2 = new Comida("Nugget", 0.367);

        Pessoa p = new Pessoa("Arthur", 128.0);

        System.out.println(p.apresentar());

        p.comer(c1);

        System.out.println(p.apresentar());

        p.comer(c2);

        System.out.println(p.apresentar());
    }
}
