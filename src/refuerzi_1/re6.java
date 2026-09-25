package refuerzi_1;

import java.util.Scanner;

public class re6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número entero: ");
        int num2 = sc.nextInt();
        if (num2 != 0 ){
            int div = num1 / num2;
            System.out.println(div);
        }else{
            System.out.println("Error: No se puede dividir entre cero.");
        }


    }
}
