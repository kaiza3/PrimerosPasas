package refuerzi_1;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  vel_max,  tiempo, distancia;
        System.out.println("dime la distancia en metros: ");
        distancia = sc.nextInt();
        System.out.println("dime la velocidad max: ");
        vel_max = sc.nextInt();
        System.out.println("dime el tiempo en segundos: ");
        tiempo = sc.nextInt();

        double km = distancia/1000;
        double min = tiempo/60;
        double tiempo2 = (km/ vel_max)*60;
        double sup = ((min *20)/100)+min;

        if (tiempo2 <= min){
            System.out.println("ok");
        } else if(min<0) {
            System.out.println("error");
        }else if (tiempo2 <=sup) {
            System.out.println("multa");
        }else if(tiempo2 >sup ){
            System.out.println("puntos");

        }
    }
}
