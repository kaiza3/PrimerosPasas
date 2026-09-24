import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("dime un numero: ");
        num = sc.nextInt();
        for ( int i =1; i <=10; i++ ){
            int mult = num * i;
            System.out.println(num + " x " + i + " = " + mult   );
        }
    }
}
