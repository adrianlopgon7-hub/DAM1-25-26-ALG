import java.util.Scanner;

public class EP0111_IVA {
    public static void main(String[] args) {

        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("dime cual es la base imponible:");
        num1 = sc.nextDouble();

        System.out.println("dime cuál es el IVA10");
        num2 = sc.nextDouble();

        sc.close();

        double resultado1 = num1 * (num2/100) ;
        double resultado2 = num1 + resultado1;

        System.out.println("La suma del IVA es:" + resultado1);

        System.out.println("Tu resultado más IVA es:" + resultado2);



    }
}
