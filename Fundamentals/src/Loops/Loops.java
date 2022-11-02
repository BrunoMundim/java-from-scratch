package Loops;

public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For: ");
        for(int i = 0; i < 5; i++){
            System.out.print("*");
        }
        System.out.println("");

        // For each loop
        System.out.println("For each: ");
        int[] array = {1, 2, 3, 4, 5};
        for(int elem: array){
            System.out.print(elem);
        }
        System.out.println("");

        // While loop
        System.out.println("While: ");
        int i = 0;
        while(i < 3){
            System.out.print(i);
            i++;
        }
        System.out.println("");

        // Do While
        System.out.println("Do while: ");
        int a = 3;
        do{
            System.out.println(a);
        } while(a < 3);


    }
}
