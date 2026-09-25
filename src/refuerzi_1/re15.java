package refuerzi_1;

import java.util.Scanner;

public class re15 {
    public static void main(String[] args) {
        int tiempo, horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo en segundos: ");
        tiempo = sc.nextInt();
        horas = tiempo / 3600;
        tiempo = tiempo % 3600;
        minutos = tiempo /60;
        tiempo = tiempo % 60;
        segundos = tiempo;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
}
