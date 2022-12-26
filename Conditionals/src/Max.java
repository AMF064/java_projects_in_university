import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        /* MOSTRAR EL MAYOR DE DOS NÚMEROS ENTEROS */

        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Primer número");
        int x = in.nextInt();
        System.out.println("Segundo número");
        int y = in.nextInt();
        in.close();

        //Output
        double max = (x + y + Math.sqrt((x-y) * (x-y)))/2; //Función auxiliar max(x,y) = (x + y + |x-y|) /2
        //Java is dumb
        System.out.printf("%.0f\n", max);
    }
}
