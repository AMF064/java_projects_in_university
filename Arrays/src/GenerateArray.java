import java.util.Scanner;
public class GenerateArray {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Tamaño del array: ");
        int size = Integer.parseInt(in.nextLine()), pos = 0;
        do{
            System.out.println("Introducir la posición en el array del número: ");
            pos = Integer.parseInt(in.nextLine());
            if(pos >= size)
                System.out.println("Posición no válida");
        } while(pos >= size);
        System.out.printf("\nIntroducir número para la posición %d del array:\n", pos);
        int n = Integer.parseInt(in.nextLine());
        in.close();

        //Generate the array
        int[] a = new int[size];
        for(int i = 0; i < size; i++){
            a[i] = (int) (Math.random() * 100);
            if(i == pos)
                a[pos] = n;
        }

        //Output
        for(int i : a)
            System.out.printf("%d\t", i);
    }
}