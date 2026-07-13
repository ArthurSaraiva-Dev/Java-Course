package classe;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto; // Mesmo conceito de Casting
            boolean nomeEquals = outro.nome.equals(this.nome);
            boolean emailEquals = outro.email.equals(this.email);
            return nomeEquals && emailEquals;
        }else {
            return false;
        }
    }
}
