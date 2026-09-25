package refuerzi_1;

import java.util.Scanner;

public class re4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num= sc.nextInt();
        if (num%10==0){
            System.out.println("es multiplo de 10");
            System.out.println("di otro numero: ");
            int num2= sc.nextInt();
            if (num2 %10==0){
                System.out.println("tambien es multiplo");
            }else{
                System.out.println("no es multiplo");
            }

        }else {
            System.out.println("no es multiplo");
        }
    }

}
