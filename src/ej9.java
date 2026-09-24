import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("dime tu edad: ");
        edad = sc.nextInt();
        if (edad >=18){
            System.out.println("mayor de edad");
        }else{
            System.out.println("menor de edad");
        }

    }
}
