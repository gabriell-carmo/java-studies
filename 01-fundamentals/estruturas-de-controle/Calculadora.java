import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro numero: ");
        double primeiro = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double segundo = sc.nextDouble();

        System.out.println("Escolha a operação desejada: ");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        int operacao = sc.nextInt();

        switch (operacao) {
            case 1: System.out.println("Resultado: " + (primeiro + segundo));
                
                break;
        
            case 2: System.out.println("Resultado: " + (primeiro - segundo));
                
                break;
        
            case 3: System.out.println("Resultado: " + (primeiro * segundo));
                
                break;

            case 4: System.out.println("Resultado: " + (primeiro / segundo));
                
                break;
                default:
                    System.out.println("Opcao Invalida");
        }

        
    }
}
