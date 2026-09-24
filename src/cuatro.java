import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double importe, descuento, total;

        System.out.println("di el importe: ");
        importe =sc.nextDouble();
        System.out.println("eres socio?: ");
        String socio = sc.next();

        if (socio.equals("si")){
            if (importe >100){
                descuento =(importe * 15)/100;
                total = importe - descuento;
                System.out.println(total);
            }else if(importe > 50){
                descuento = (importe * 10)/100;
                total = importe - descuento;
                System.out.println(total);
            }else{
                System.out.println(importe);
            }

        }else {
            if (importe >50) {
                descuento = (importe * 5) / 100;
                total = importe - descuento;
                System.out.println(total);
            }else{
                System.out.println(importe);
            }

        }
    }
}
