package ExceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        // PrintStackTrace
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

        // ToString
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println(e.toString());
        }

        // getMessage() imprime apenas a mensagem do erro
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}
