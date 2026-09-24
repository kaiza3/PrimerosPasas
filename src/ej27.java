import java.util.Scanner;

public class ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador=0;
        System.out.println(" dime un numero: ");
        num= sc.nextInt();
        for (int i =1 ; i<= num; i++){
           for(int y=1; y<=i; y++){
               System.out.print(y+" ");
           }
            System.out.println();
        }

    }
}
