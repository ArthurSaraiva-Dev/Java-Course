package classe;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;
    // O PI é existente no Math, mas somente é para cunho de estudos nesse caso.

    AreaCirc (double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }


}
