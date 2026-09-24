import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double horas;
        double pago;
        double impuestos;
        System.out.println(" cuanto te pagan por hora: ");
        precio = sc.nextInt();
        System.out.println(" cuantas horas trabajas: ");
        horas = sc.nextInt();
        if (horas <= 35) {
            pago = precio * horas;
            System.out.println("pago bruto : "+pago);


        } else {
            double horas_extra = horas - 35;
            double pago_extra = (precio * 1.5) * horas_extra;
            pago = (precio * 35) + pago_extra;
            System.out.println("pago bruto: "+pago);
        }
        if (pago <= 500) {
            impuestos = 0;

        } else if (pago <= 900) {
            impuestos = (pago * 25)/100;

        }else{
            impuestos = (pago * 45 )/100;
        }
        double salario_neto= pago - impuestos;
        System.out.println("impuestos: "+impuestos);
        System.out.println("salario neto: "+salario_neto);

    }
}
