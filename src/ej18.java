import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        int min;
        int seg;
        System.out.println("dime q hora es : ");
        hora = sc.nextInt();
        System.out.println("dime los min: ");
        min = sc.nextInt();
        System.out.println("dime q  seg es : ");
        seg = sc.nextInt();
        seg = seg +1;

        if (seg >= 60){
            min = min +1;
            seg = 0;
            if (min >=60){
                min = 0;
                hora = hora +1;

            }
        }
        System.out.println("la hora es: "+hora +","+ min + "," + seg);


    }
}
