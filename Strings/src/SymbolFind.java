import java.util.Scanner;

public class SymbolFind {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("DNI con un símbolo: ");
        String dni = in.nextLine();
        in.close();
        
        int len = dni.length();
        String symbols = "- ";
        char dniSymbol = dni.charAt(len-2);
        if (symbols.indexOf(dniSymbol) == -1)
            System.out.println("No está");
        else
            System.out.println("Sí está");
    }
}
