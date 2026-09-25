package refuerzi_1;

import java.util.Scanner;

public class re11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        System.out.println("Dime otro numero: ");
        int numero2 = sc.nextInt();
        if (numero %2 ==0 && numero2 %2 ==0){
            System.out.println("es par");

        }else {
            System.out.println("no es par");
        }
    }
}
