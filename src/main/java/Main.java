import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            erroCalculo(num1, num2);
        }catch (InputMismatchException e){
            System.out.println("Erro de tipo de entrada " +e.getMessage());
        }

    }

    public static void erroCalculo(int num1, int num2) {
        try {
            int divisaoInteira = num1 / num2;
            System.out.println(divisaoInteira);
        }catch (ArithmeticException e){
            System.out.println("Erro de calculo Aritimetico: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Erro de calculo Aritimetico: " + e.getMessage());
        }

    }
}
