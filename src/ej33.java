import java.util.Scanner;

public class ej33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 1;
        double num2 =1;
        double i = 3;
        while (i <=40){
            double t = num + num2;
            num = num2;
            num2 = t;
            double n = t/num;
            System.out.println(n);
            i++;
        }

    }
}


