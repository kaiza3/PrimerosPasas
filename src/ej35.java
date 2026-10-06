import java.util.Scanner;

public class ej35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero: ");
        int num = sc.nextInt();
        System.out.println("dime otro numero: ");
        int num2 = sc.nextInt();
        while (num >= num2) {
            num = num - num2;
        }
        System.out.println(num);
    }
}