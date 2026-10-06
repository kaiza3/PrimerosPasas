import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra;
        System.out.println("dime la contraseña: ");
        contra = sc.next();
        int intentos=3;
        String login;
        while (intentos !=0){
            System.out.println("contraseña: ");
            login = sc.next();
            if (login.equals(contra)){
                System.out.println("correcto");
                intentos=0;
            }else{
                intentos= intentos-1;
                System.out.println("incorrecto. te quedan "+ intentos + " intentos");
            }
        }
    }
}
