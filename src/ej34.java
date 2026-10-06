import java.util.Scanner;

public class ej34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero: ");
        int num = sc.nextInt();
        System.out.println("dime otro numero: ");
        int num2 = sc.nextInt(), resultado =0;
        for (int i =1;i<=num2; i++ ){
            resultado = resultado + num;
        }
        System.out.println(resultado);

    }
}
