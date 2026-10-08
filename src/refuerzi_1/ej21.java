package refuerzi_1;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el grosor del papel: ");
        double grosor_papel = sc.nextInt();
        System.out.println("dime tla altura del edificio en metros: ");
        double altura_ed = sc.nextInt();
        double contador= 0;
        double metros = grosor_papel/1000000;
        while(metros<=altura_ed){
            metros=metros*2;
            contador++;
        }
        System.out.println(contador);
    }
}
