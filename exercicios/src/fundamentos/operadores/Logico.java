package fundamentos.operadores;

public class Logico {
    static void main(String[] args) {
        boolean c1 = true;
        boolean c2 = 3 > 9; // false

        System.out.println(c1 && c2);
        System.out.println(!c1 && c2);
        System.out.println(c1 || c2);
        System.out.println(c1 ^ c2);
        System.out.println(!c1);
        System.out.println(!c2);

        // TABELA VERDADE "AND"
        System.out.println("\nTabela verdade E");
        System.out.println(true && true); //TRUE
        System.out.println(true && false); //FALSE
        System.out.println(false && false); //FALSE

        // TABELA VERDADE "OR"
        System.out.println("\nTabela verdade OU");
        System.out.println(true || true); //TRUE
        System.out.println(true || false); //TRUE
        System.out.println(false || false); //FALSE
        System.out.println(false || true); //TRUE

        // TABELA VERDADE "XOR"
        System.out.println("\nTabela verdade XOR (OU EXCLUSIVO)");
        System.out.println(true ^ true); //FALSE
        System.out.println(true ^ false); //TRUE
        System.out.println(false ^ false); //FALSE
        System.out.println(false ^ true); //TRUE

        // TABELA VERDADE "NOT"
        System.out.println("\nTabela verdade XOR (OU EXCLUSIVO)");
        System.out.println(!false); //TRUE
        System.out.println(!true); //FALSE

    }
}
