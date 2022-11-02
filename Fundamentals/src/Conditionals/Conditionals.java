package Conditionals;

public class Conditionals {

    public static void main(String[] args) {
        // If else clássico
        int nota = 6;

        if(nota >= 6)
            System.out.println("Aprovado!");
        else if(nota >= 4)
            System.out.println("Recuperação!");
        else
            System.out.println("Reprovado!");

        // Operador ternário
        String resultado = nota >= 6 ? "Aprovado" : nota >= 4 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        // Switch case
        char tamanho = 'M';

        switch (tamanho){
            case 'P':
                System.out.println("Pequeno");
                break;
            case 'M':
                System.out.println("Médio");
                break;
            case 'G':
                System.out.println("Grande");
                break;
            default:
                System.out.println("Tamanho indefinido");
                break;
        }
    }
}
