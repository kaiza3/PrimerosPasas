package refuerzi_1;

import java.util.Scanner;

public class re3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número entero: ");
        int num2 = sc.nextInt();

        if ( num1 % num2 ==0){
            System.out.println("multiplo");
        }else {
            System.out.println("no multiplo");
        }

    }
}
