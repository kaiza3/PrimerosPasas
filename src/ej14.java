import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("di un numero: ");
        num = sc.nextInt();

        if ( num < 3){
            System.out.println("Muy deficiente");

        } else if (num <5 ) {
            System.out.println(" insuficiente");

        } else if (num <6) {
            System.out.println("suficiente");

        } else if (num< 7) {
            System.out.println("bien");

        } else if (num <9) {
            System.out.println("notable");

        } else if (num<=10){
            System.out.println("sobresaliente");
        }
    }
}
