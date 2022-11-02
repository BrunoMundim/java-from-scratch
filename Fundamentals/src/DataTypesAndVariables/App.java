package DataTypesAndVariables;

/**
 * Referências:
 * <a href="https://www.guru99.com/java-variables.html">Java variables</a>
 * <a href="https://www.javatpoint.com/java-variables">Java variables</a>
 * <a href="https://www.javatpoint.com/java-data-types">Java Data Types</a>
 */

public class App {

    public static void main(String[] args) {
        /*
        Variáveis tem três tipos:
            - Local: Declaradas no corpo de um método
            - Instance: Declaradas fora do método e seu valor varia
            - Static: Constantes, não podem ser declaradas em um método
        */
        // Podem ser inicializadas em grupo
        int a, b, c;
        int d=2, e=3, f=4;
        // static int estatico = 10; Não permitido dentro do método main

        /*
        Data Types:
            I. Primitive: Boolean, Numeric
                I.a) Numeric: Character, Integral
                I.b) Integral: Integer, Floating-Point
                I.c) Integer: Byte, Short, Int, Long
                I.d) Floating-Point: Float, Double
            II. Non-Primitive: String, Array, etc.
         */

        // Type casting
        int x = 10;
        double z = x;
        // Type casting de um tipo mais específico, para um menos, exige o cast explícito, no caso (int)
        x = (int) z;
    }

    static int estatico = 10; // Permitido fora do método
}
