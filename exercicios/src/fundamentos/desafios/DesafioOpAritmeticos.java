package fundamentos.desafios;


public class DesafioOpAritmeticos {
    static void main(String[] args) {
        // SUPERIOR ESQUERDA
        double numA = Math.pow(6 *(3 + 2), 2);
        double denA = 3 * 2;
        double superiorA = numA / denA;

        double numB = (1 -5) * (2 - 7);
        double denB = 2;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println(resultado);

    }
}
