import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("dime tu saldo: ");
        int saldo_in = sc.nextInt();
        System.out.println("1, ingresa 2, retirar 0, salir");
        int elegir = sc.nextInt();

        while (elegir != 0){
            if (elegir ==1){
                System.out.println("cuanto quieres ingresar: ");
                int tramite= sc.nextInt();
                saldo_in = saldo_in + tramite;
                System.out.println(saldo_in+"€");
                System.out.println("1 ingresa, 2 retirar, 0 salir");
                elegir = sc.nextInt();
            } else if (elegir == 2) {
                System.out.println("cuanto quieres retirar: ");
                int tramite= sc.nextInt();
                saldo_in = saldo_in - tramite;
                System.out.println(saldo_in+"€");
                System.out.println("1 ingresa, 2 retirar, 0 salir");
                elegir = sc.nextInt();
            }
        }
        System.out.println("Adios");
    }
}
