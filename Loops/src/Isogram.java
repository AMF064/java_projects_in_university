package Loops.src;
import java.util.Scanner;

public class Isogram {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir frase o palabra: ");
        String str = in.nextLine();
        in.close();

        //Change to lowercase
        str = str.toLowerCase();

        //Helper variables
        String model = "abcdefghijklmnñopqrstuvwxyz";

        //Output
        for(int i = 0 ; i < model.length() ; i++){
            char c = model.charAt(i);
            if(str.indexOf(c) != str.lastIndexOf(c)){
                System.out.println("No es isograma.");
                return;
            }
        }
        System.out.println("Es un isograma.");
    }
}
