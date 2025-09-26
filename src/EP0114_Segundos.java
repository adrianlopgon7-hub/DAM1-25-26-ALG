import java.util.Scanner;

public class EP0114_Segundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas;
        double minutos;
        double segundos;

        System.out.println("Cuántas horas son?:");
        horas = sc.nextDouble();

        System.out.println("Cuántos minutos son?:");
        minutos = sc.nextDouble();

        System.out.println("Cuántos segundos son?:");
        segundos = sc.nextDouble();

        sc.close();

        double resultado = horas * 3600 + minutos * 60 + segundos;

        System.out.println("Tu resultado en segundos es:" + resultado);



    }
}
