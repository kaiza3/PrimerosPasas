import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kwh, precio;
        System.out.println("dime tu consumo mensual: ");
        kwh = sc.nextInt();
        if (kwh <= 100) {
            precio = kwh * 0.10;
        } else if (kwh <300) {
            precio = (100 * 0.10) + ((kwh-100) * 0.15);
        }else{
            precio = (100* 0.10)+(200*0.15) +((kwh-300) * .20);
        }
        System.out.println(precio);

    }

}