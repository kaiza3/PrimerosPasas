import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio_real;
        System.out.println("introduce el precio real: ");
        precio_real = sc.nextDouble();
        double precio_rebajado;
        System.out.println("introduce el precio rebajado: ");
        precio_rebajado = sc.nextInt();
        double descuento = (precio_real - precio_rebajado)/precio_real*100;
        System.out.println("el descuento es: "+ descuento);
    }
}
