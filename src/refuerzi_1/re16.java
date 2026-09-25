package refuerzi_1;

import java.util.Scanner;

public class re16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        System.out.println("Dime otro numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Dime el tercer numero: ");
        int numero3= sc.nextInt();

        if (numero >= numero2 && numero>=numero3 ){
            int mayor = numero;
            System.out.println(mayor);

        } else if (numero2 >= numero && numero2 >=numero3) {
            int mayor = numero2;
            System.out.println(mayor);
        }else{
            int mayor= numero3;
            System.out.println(mayor);
        }
    }
}
