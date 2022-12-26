package Loops.src;
import java.util.Scanner;
public class DNA {
    public static void main(String[] args) {
        /*HAMMING DISTANCE*/
        //Input
        Scanner in = new Scanner(System.in);
        String model = "ATCG";
        System.out.println("Introducir dos cadenas: ");
        String str1 = new String();
        String str2 = new String();
        boolean valid = true;                           //Condition variable
        do {
            valid = true;
            str1 = in.nextLine();
            str2 = in.nextLine();
            for(int i = 0 ; i < str1.length() ; i++){   //String 1 validation
                char c = str1.toUpperCase().charAt(i);
                if(model.indexOf(c) == -1){
                    System.out.println("Cadena 1 inválida: volver a introducir ambas: ");
                    valid = false;
                }
            }
            for(int j = 0 ; j < str2.length() ; j++){   //String 2 validation
                char b = str2.toUpperCase().charAt(j);
                if(model.indexOf(b) == -1){
                    System.out.println("Cadena 2 inválida: volver a introducir ambas: ");
                    valid = false;
                }
            }
        } while(!valid);
        in.close();

        //Helper variables
        int count = 0;
        int len1 = str1.length();
        int len2 = str2.length();
        
        //Process
        for(int i = 0 ; i < Math.min(len1, len2) ; i++){
            char c = str1.toUpperCase().charAt(i);
            char b = str2.toUpperCase().charAt(i);
            if(b != c)
                count++;
        }
        System.out.println(count + Math.abs(len1 - len2));  //Count the length difference as a difference in a character
    }
}
