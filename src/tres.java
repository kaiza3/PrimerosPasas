import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("dime un lado de un triangulo: ");
        lado1 = sc.nextInt();
        System.out.println("dime un otro lado  de un triangulo: ");
        lado2 = sc.nextInt();
        System.out.println("dime un tercer lado de un triangulo: ");
        lado3 = sc.nextInt();

        if ((lado1 + lado2) >lado3 && (lado1 + lado3)> lado2 && (lado2 +lado3)>lado1){
            if(lado1 == lado2&& lado2 == lado3){
                System.out.println("equilatero");

            }else if(lado1==lado2 && lado2 != lado3){
                System.out.println("isosceles");
            }else if (lado1 != lado2 && lado2 != lado3){
                System.out.println("escaleno");
            }

            System.out.println("es un triangulo");
        }else{
            System.out.println("no triangulo");
        }

    }
}
