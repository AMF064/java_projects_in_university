import java.util.Scanner;
public class CountAppearances {
    public static void main(String[] args) {
        //Input stream and array with random numbers
        int[] a = new int[100];
        for(int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);

        //Input
        System.out.println("Introducir número del 1 al 100: ");
        int i = Integer.parseInt(in.nextLine());
        in.close();

        //Output
        int count = 0;
        for(int j = 0; j < a.length; j++)       //Count the number of times a certain number appears in the array
            if(a[j] == i)
                count++;
        System.out.printf("El %d aparece %d veces en el array", i, count);
    }
}
