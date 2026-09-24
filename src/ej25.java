import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        double numero, fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("dime un numero: ");
        numero = sc.nextDouble();

        for (double i= 1; i <= numero; i++){
            fact = fact * i;
            System.out.print(numero + "x" + i + "=" +fact);

        }
    }
}
