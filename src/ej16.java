import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("di un numero: ");
        num1 = sc.nextInt();
        System.out.println("di otro numero: ");
        num2 = sc.nextInt();

        String operacion;
        System.out.println("Introduce la operación a realizar (+, -, *, /):");
        operacion = sc.next();
        switch (operacion) {
            case "+":
                System.out.println("suma: " + (num1 + num2));
                break;
            case "-":
                System.out.println("resta: " + (num1 - num2));
                break;
            case "*":
                System.out.println("mult: " + (num1 + num2));
                break;
            case "/":
                System.out.println("div: " + (num1 / num2));
                break;

        }

    }
}
