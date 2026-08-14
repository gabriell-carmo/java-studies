public class Operadores {
    public static void main(String[] args) {
        double a = 5.0;
        int b = 10;

        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a multiplicado por b: " + a * b);
        System.out.println("a dividido por b: " + a / b);
        System.out.println("Resto da divisão " + a % b);

        System.out.println("a igual a b " + (a == b));
        System.out.println("a maior que b " + (a > b));
        System.out.println("a menor ou igual a b " + (a <= b));

        System.out.println("a <10 e b >=10 " + (a <10 && b>= 10));
    }
}
