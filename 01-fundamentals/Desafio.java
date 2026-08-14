import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: "); 
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        String situacaoIdade = "";

        if (idade <18) {
            situacaoIdade = "menor de idade";  
        }

        else if (idade >=60) {
            situacaoIdade = "idoso";
        }

        else {
            situacaoIdade = "adulto";
        }

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        String situacaoNota = "";

        if (nota >=7) {
            situacaoNota = "aprovado";
        }

        else if (nota >=5) {
            situacaoNota = "recuperacao";
        }

        else {
            situacaoNota = "reprovado";
        }

        System.out.println(nome + ", você é " + situacaoIdade + " e foi " + situacaoNota + " com nota " + nota);

       
    }
}
