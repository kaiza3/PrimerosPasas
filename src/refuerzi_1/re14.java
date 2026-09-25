package refuerzi_1;

import java.util.Scanner;

public class re14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        System.out.println("Dime otro numero: ");
        int numero2 = sc.nextInt();

        if (numero >=0 & numero2>=0){
            System.out.println("2 positivos");

        } else if (numero >=0 | numero2 >=0) {
            System.out.println("1 es positivo");
        }else{
            System.out.println("ninguno es positivo");
        }
    }
}
