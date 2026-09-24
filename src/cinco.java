import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("dime la nota; ");
        nota = sc.nextDouble();
        System.out.println("has entregado todas las precticas?: ");
        String practicas = sc.next();
        if (nota<5){
            System.out.println("suspenso");
        } else if (nota >= 5 && practicas.equals("no")) {
            System.out.println("suspenso por practicas");
        }else if (nota >=5 && practicas.equals("si")){
            if (nota <= 6.9){
                System.out.println("aprobado");
            }else if(nota <=8.9){
                System.out.println("notable");

            }else if(nota <=10) {
                System.out.println("sobresaliente");
            }
        }
    }
}
