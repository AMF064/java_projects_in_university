import java.util.Scanner;

public class RString {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String str1 = in.nextLine();
        String str2 = new String();
        in.close();

        //Helper variable
        int len = str1.length();

        //Output
        for(int i = 0 ; i < len ; i++){
            str2 += str1.charAt(len-1-i);
        }
        System.out.println(str2);
    }
}
