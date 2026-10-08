package refuerzi_1;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu saldo: ");
        int saldo_cuenta = sc.nextInt();
        System.out.println("dime tus ingresos: ");
        int ingresos = sc.nextInt();
        System.out.println("dime tus gastos: ");
        int gastos = sc.nextInt();
        int cambio = (ingresos - gastos)+saldo_cuenta;
        if (cambio<=0){
            System.out.println("no");
        }else{
            System.out.println("si");
        }
    }
}
