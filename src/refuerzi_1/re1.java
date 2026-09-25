package refuerzi_1;

import java.util.Scanner;

public class re1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        int doble = numero *2;
        int triple = numero *3;
        System.out.println("doble: " + doble);
        System.out.println("triple: " + triple);
    }
}
