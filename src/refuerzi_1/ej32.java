package refuerzi_1;

import java.util.Scanner;

public class ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int num2 =1;
        int i = 3;
        while (i <=40){
            int t = num + num2;
            System.out.printf("," + t);
            num = num2;
            num2 = t;
            i++;
        }

    }
}
