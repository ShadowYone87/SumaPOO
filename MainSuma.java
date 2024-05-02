import java.util.Scanner;

public class MainSuma{
        public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Suma n1 = new Suma();
     System.out.println("Ingresa un numero");
        n1.setA(num.nextInt());
        System.out.println("Ingrese el segundo numero");
        n1.setB(num.nextInt());
        System.out.println("El resultado es:");
        System.out.println(n1.sumar());
        System.out.println(n1);
        
        n1.getA();
        n1.getB();
        
    }
}