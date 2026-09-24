import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        int radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el radio :");
        radio = sc.nextInt();
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("El perimetro es : " + perimetro);
        System.out.println("El area es : " + area);
    }
}
