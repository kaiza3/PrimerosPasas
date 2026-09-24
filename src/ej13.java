import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int orden;
        System.out.println("di un numero: ");
        num1 = input.nextInt();
        System.out.println("di otro numero: ");
        num2 = input.nextInt();
        System.out.println("elije el orden, 1 para ascendente, elije 2 para descentende: ");
        orden = input.nextInt();
        if (orden == 1) {
            if (num1 > num2) {
                System.out.println(num2 + "<" + num1);
            } else {
                System.out.println(num1 + "<" + num2);
            }

        }
        if (orden == 2) {
            if (num1 < num2) {
                System.out.println(num2 + ">" + num1);
            } else {
                System.out.println(num1 + ">" + num2);
            }

        }

    }
}
