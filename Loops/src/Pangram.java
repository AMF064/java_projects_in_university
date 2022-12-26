package Loops.src;
import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        //Helper variables
        String alpha = "abcdefghijklmnoupqrstuvwxyz";

        //Output
        for(int i = 0 ; i < 26 ; i++){
            char c = alpha.charAt(i);
            if(str.indexOf(c) == -1){
                System.out.println("No es pangrama");
                return;
            }
        }
        System.out.println("Es pangrama");
    }
}
