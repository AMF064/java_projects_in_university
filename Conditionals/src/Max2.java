import java.util.Scanner;
public class Max2 {
    public static void main(String[] args) {
        /* OUTPUT THE MAX OF TWO NUMBERS */
        //Input
        Scanner in = new Scanner(System.in);
        int a, b;
        a = Integer.parseInt(in.nextLine());
        b = Integer.parseInt(in.nextLine());
        in.close();

        //Using a ternary operator: value = condition ? value_if_true : value_if_false;
        int max = (a > b ? a : b);
        System.out.println(max);
    }
}
