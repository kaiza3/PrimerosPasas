import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("dime el primer numero: ");
        num1 = sc.nextInt();
        System.out.println(" dime el segundo numero: ");
        num2 =sc.nextInt();
        if (num1<num2){
            System.out.println(num1 + "<" + num2);
        }else{
            System.out.println(num2 + ">"+ num1);
        }
    }
}
