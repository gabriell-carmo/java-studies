import java.util.Scanner;
import java.util.Locale;

public class EntradaDados {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

       System.out.print("Digite seu nome: "); 
       String nome = sc.nextLine();

       System.out.print("Digite sua idade: ");
       int idade = sc.nextInt();

       System.out.print("Digite sua altura: ");
       double altura = sc.nextDouble();

       System.out.println(nome + " tem " + idade + " anos " + "e " + altura + "m ");



       sc.close();

    }
   


   

}
