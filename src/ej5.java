import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Di el primer numero: ");
        num1 = input.nextInt();

        System.out.println("Di el segundo numero: ");
        num2 = input.nextInt();
        int sum;
        int sub;
        int mult;
        int div;
        sum = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div =  num1 / num2;
        System.out.println("la suma: " + sum +"\n"+ "la sub: " + sub + "\n" + "la mult: " + mult +"\n" + "la div: " + div );
    }
}
