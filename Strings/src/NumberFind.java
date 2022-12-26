import java.util.Scanner;

public class NumberFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir DNI con 8 dígitos: ");
        String dni = in.nextLine();
        in.close();

        int len = dni.length();
        String asciiNum = "0123456789";
        String dniDigits = dni.substring(0, 8);
        
        for(int i = 0 ; i < len ; i++){
            char num = dniDigits.charAt(i);
            if(asciiNum.indexOf(num) == -1)
                System.out.println("Hay un no número");
            else
                System.out.println("Hay un número");
        }
    }
}
