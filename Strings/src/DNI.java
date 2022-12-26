import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir DNI, debe contener al menos 7 caracteres: ");
        String dni = in.nextLine();
        in.close();
        
        //Helper variables
        int len = dni.length();
        String asciiNum = "0123456789";
        String asciiChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String symbols = "- ";
        String dniDigits = dni.substring(0,8);
        char dniChar = dni.charAt(len-1);
        char dniSymbol = dni.charAt(len-2);

       //Output
        if (len < 9 || len > 10){                       //Check if the string is as long as it should be
            System.out.println("No válido");
            return;
        }
        else if (asciiChars.indexOf(dniChar) == -1){    //Check if dniChar is a possible letter
            System.out.println("No válido");
            return;
        }
        else if (len == 10){                            //Check for symbols when len == 10
            if (symbols.indexOf(dniSymbol) == -1){
                System.out.println("No válido");
                return;
            }
        } else {
            for (int i = 0 ; i < dniDigits.length() ; i++){     //Check if every number is a number
                char digit = dniDigits.charAt(i);
                if(asciiNum.indexOf(digit) == -1){
                    System.out.println("No válido");
                    return;
                }
            }
        }
        System.out.println("Válido");
    }
}