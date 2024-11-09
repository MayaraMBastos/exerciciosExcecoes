import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            //------------------
            int num1 = sc.nextInt();
            sc.nextLine();
            int num2 = sc.nextInt();
            sc.nextLine();
            divisaoCalculo(num1, num2);

            //----------------
            int[] vInt = new int[3];
            for (int i = 0; i < vInt.length; i++) {
                vInt[i] = sc.nextInt();
            }
            indiceDeVetorNullo(vInt);

            //----------------
            String sNumero = sc.next();
            castErrado(sNumero);

        } catch (InputMismatchException e) {
            System.out.println("Erro de tipo de entrada " + e.getMessage());
        }


    }

    public static void divisaoCalculo(int num1, int num2) {
        try {
            int divisaoInteira = num1 / num2;
            System.out.println(divisaoInteira);
        } catch (ArithmeticException e) {
            System.out.println("Erro de calculo Aritimetico: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void indiceDeVetorNullo(int[] vetor) {
        // tamanho do vetor mais 1 para teste de erro de acesso a indice
        int indice = vetor.length + 1;
        try {
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro no acesso a indice de vetor inexistente " + e.getMessage());
        }

    }

    public static void castErrado(String stNum){
        try {
            int num = Integer.parseInt(stNum);
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Erro na conversao de String para numero " + e.getMessage());
        }

    }
}
