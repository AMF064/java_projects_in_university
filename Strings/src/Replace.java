import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Di lo que quieras: ");
        String str = in.nextLine();
        in.close();

        //Output
        System.out.println(str.replace('a', '_'));
    }
}
