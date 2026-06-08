package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(7.9);
        // AreaCirc.PI = 3.14159; Não pode ser acessado, poís é uma constante declarada.

        System.out.println(a.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
