package refuerzi_1;

import java.util.Scanner;

public class re7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = sc.nextInt();
        if (num1 %2==0){
            System.out.println("multiplo de 2");
        } else if (num1 %3==0) {
            System.out.println("multiplo de 3");

        }
    }
}
