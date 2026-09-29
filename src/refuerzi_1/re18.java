package refuerzi_1;

import java.util.Scanner;

public class re18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        if (numero % 2 ==0){
            System.out.println((numero + 2)+"," + (numero +4) +","+ (numero +6) +","+ (numero+8) +","+ (numero + 10));
        }else{
            System.out.println((numero + 1)+"," + (numero +3) +","+ (numero +5) +","+ (numero+7) +","+ (numero + 9));
        }
    }
}
