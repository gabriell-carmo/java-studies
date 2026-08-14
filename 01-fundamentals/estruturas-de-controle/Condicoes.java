import java.util.Locale;
import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >=18) { 
            System.out.println("Maior de idade");
          
        }

        else {
            System.out.println("Menor de idade");
        }

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
            
        }

        else {
            System.out.println("Impar");
        }

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        if (numero >0) {
            System.out.println("Positivo");
            
        }

        else if (numero <0) {
            System.out.println("Negativo");
        }

        else {
            System.out.println("Zero");
        }
    }
}
