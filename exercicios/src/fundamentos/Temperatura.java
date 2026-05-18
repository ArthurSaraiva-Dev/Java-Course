package fundamentos;

public class Temperatura {
    public static void main (String[] args){
        // (F - 32) x 5/9 = C
        final double  AJUSTE = 32.0; 
        final double FATOR = 5.0/9.0;
        
        double f = 86;
        double c = (f - AJUSTE) * (FATOR);
        System.out.println("A temperatura " + f + " Fahrenheit em Celcius é: " + c + "°C");
        
        f = 145;
        c = (f - AJUSTE) * (FATOR);
        System.out.println("A temperatura " + f + " Fahrenheit em Celcius é: " + c + "°C");
    }
}
