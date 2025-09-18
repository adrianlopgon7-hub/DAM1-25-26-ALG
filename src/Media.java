import java.util.Scanner;

public class Media  {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime cual es la primera nota:"); 
        num1 = sc.nextInt();

        System.out.print("Dime cual es la segunda nota:");
        num2 = sc.nextInt();

        System.out.print("Dime cual es la tecera nota:");
        num3 = sc.nextInt();

        double total = (num1 + num2 + num3) /3.0;
        sc.close();

        System.out.println("tu media es de:" + total);
        
    
    }
}
