import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero, positivo = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("dime un numero: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                positivo = positivo + 1;

            }
        }
        System.out.println(positivo);
    }
}
