package refuerzi_1;

import java.util.Scanner;

public class re2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();
        if (numero % 2 ==0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
