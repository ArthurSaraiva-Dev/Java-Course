package fundamentos;

public class Wrappres {
    public static void main(String[] args) {
        // São a forma de objeto dos Tipos Primitivos

        Byte b = 2;
        Short s = 100;
        Integer i = 10000;
        Long l = 110000L;
        Float f = 123.90F;
        Double d = 1232.3545;



        System.out.println(b.byteValue());
        System.out.println((s.toString()));
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(f);
        System.out.println(d);


        Boolean bo = true; // mesma coisa só que com letra minúscula
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '$'; // char
        System.out.println(c + "!!!");

  
    }
}
