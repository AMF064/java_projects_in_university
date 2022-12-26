package Loops.src;
import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
        /* ISBN */
        //Input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        //Remove hyphens
        str = str.replace("-" , "");


        //Helper variables
        String model1 = "0123456789";
        String model2 = model1+'X';
        int result = 0;
        int i = 0;                      //Counter
        String c = "" + str.charAt(i);
        int end = str.length() - 1;


        //Output
        if(str.length() != 10){                      //Check if there are 10 characters
            System.out.println("No ISBN");
            return;
        }
        for(; i < 9 ; i++){                             //Check if the first 9 chars are numbers
            if(model1.indexOf(c) == -1){
                System.out.println("No ISBN");
                return;
            }
        }
        i++;
        if(model2.indexOf(c) == -1){                    //Check if the last char is a valid character
            System.out.println("No ISBN");
            return;
        }
        for (i = 1; i < 10 ; i++){
            int num = Integer.parseInt("" + str.charAt(i - 1));
            result += (num * (10 - i + 1));
        }
        int finalNum = Integer.parseInt("" + str.charAt(end));
        if (str.charAt(end) == 'X')
            finalNum = 10;
        result = (result + finalNum) % 11;
        if (result != 0){
            System.out.println("No ISBN");
            return;
        }
        System.out.println("Es ISBN");
    }
}
