import java.util.Scanner;

public class Area {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("escribe aqui el valor del radio:");
            double radio = sc.nextDouble();
            
            double perimetro = 2 * Math.PI * radio;
            double area = Math.PI * radio*radio;

            sc.close();

            System.out.println("el preímetro es de:" + perimetro);
            System.out.println("el area es de:" + area);

    }
    
}
