package refuerzi_1;

import java.util.Scanner;

public class re8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0 && num1 % 3 == 0) {
            System.out.println("multiplo de los 2");
        } else {
            System.out.println("El número " + num1 + " NO és múltiple de 2 i de 3 simultàniament.");
        }
    }
}