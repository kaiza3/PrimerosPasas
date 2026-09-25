package refuerzi_1;

import java.util.Scanner;

public class re5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num= sc.nextInt();
        if (num == 0 ){
            System.out.println("El producto de 0 por cualquier número es 0");

        }else{
            System.out.println("di otro numnero: ");
            int num2=sc.nextInt();
            int producto = num * num2;
            System.out.println(producto);
        }
    }
}
