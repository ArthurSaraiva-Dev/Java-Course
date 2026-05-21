package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Lol é ruim!".charAt(2)); // A saída será "l"

        String s = "Boa noite, Guys";
        
        // Não modifica o valor original de "s"
        System.out.println(s.concat("!!!")); 
        
        // Também não modifica
        System.out.println(s + "!!!"); 
        
        // verifica se a string inicia com "Boa"
        System.out.println(s.startsWith("Boa")); 
        
        // verifica se a string inicia com "boa"
        System.out.println(s.toLowerCase().startsWith("boa"));  
        
        // Retorna o tamanho da string
        System.out.println(s.length()); 
        
        // Verifica se a string termina com "Guys"
        System.out.println(s.endsWith("Guys")); 
        
        // Verifica a igualdade
        System.out.println(s.equals("boa noite, guys")); 

        // Verifica a igualdade ignorando letras Maiúsculas ou Minúsculas
        System.out.println(s.equalsIgnoreCase("boa noite, guys")); 
        
        // Identifica o Index da string indicada
        System.out.println(s.indexOf("Guys")); 
        
        
        // Itilizando Inferência de tipos
        var nome = "Arthur";
        var sobrenome = "Saraiva";
        var idade = 20;
        var salario = 15000.00;

        // Utilizando o format em vez da concatenação            
        System.out.printf("Nome: %s %s \nIdade: %d \nSalário: R$%.2f\n", 
            nome, sobrenome, idade, salario); 

        // Também é possível armazenar em uma string
        String frase = String.format("\nNome: %s %s \nIdade: %d \nSalário: R$%.2f", 
            nome, sobrenome, idade, salario);
        System.out.println(frase);

    }
}
