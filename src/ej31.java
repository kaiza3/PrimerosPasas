import java.util.Scanner;

public class ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero: ");
        int num = sc.nextInt();
        for (int i= 1; i <= num; i++){
            if(num%i==0){
                System.out.println(i+" ");
            }

        }
    }
}
