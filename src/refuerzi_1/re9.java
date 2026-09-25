package refuerzi_1;

import java.util.Scanner;

public class re9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0 && numero % 3 !=0){
            System.out.println("es posible de 2 pero no de 3");

        }else {
            System.out.println("no cumple la s condiciones");
        }

    }
}
