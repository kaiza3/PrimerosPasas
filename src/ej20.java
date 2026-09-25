import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, descuento;
        System.out.println("dime el precio del producto: ");
        precio = sc.nextDouble();
        if (precio < 6 ){
            descuento = 0;
        } else if (precio < 60 ) {
            descuento = precio * 5/100;
        }else{
            descuento = precio * 10/100;
        }
        System.out.println(precio - descuento);
    }
}
