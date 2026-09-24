import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador = 0, media= 0, suma = 0, hay_10= 0;
        do {
            System.out.println("dime un numero: ");
            num = sc.nextInt();
           if (num >=0) {
               contador = contador + num;
               suma = suma + 1;
               media = contador / suma;
           }
           if(num ==10){
               hay_10 = hay_10 +1;

           }

        }

        while (num != -1);
        System.out.println(media);
        if (hay_10 ==1){
            System.out.println("hay 10");
        }else {
            System.out.println("no hay 10");
        }

    }
}