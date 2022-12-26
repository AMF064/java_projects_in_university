import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        /* PAR O IMPAR */
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Número entero: ");
        int num = in.nextInt();
        in.close();

        //Output
        if (num % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
}