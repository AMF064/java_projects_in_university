package Loops.src;
import java.util.Scanner;
public class ConvertToArray {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        //Count spaces
        int white = 0;
        for(int i = 0; i < str.length() ; i++){
            char c = str.charAt(i);
            if (c == ' ')
                white++;
        }

        //Convert the string to char array
        char[] string = new char[str.length()];
        for(int i = 0 ; i < str.length() ; i++)
            string[i] = str.charAt(i);
        
        //String array with white+1 spaces, for each word
        String[] words = new String[white+1];
        int k;
        for(int i = 0; i <= white; i++){
            k = (str.indexOf(' ') == -1 ? str.length() : str.indexOf(' '));
            words[i] = str.substring(0 , k);
            str = (str.indexOf(' ') == -1 ? str.substring(k) : str.substring(k + 1));
        }
        for(String i : words)
            System.out.println(i);
    }
}