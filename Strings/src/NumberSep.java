import java.util.Scanner;

class NumberSep {
    public static void main(String[] args) {
        //Variables
        String num = "";
        int point = 0;



        //Input
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca número: ");
        num = input.nextLine();
        input.close();

        //Valor point: se puede poner , o . para separar parte entera y decimal
        for(; num.charAt(point) != '.' && num.charAt(point) != ','; point++);

        //Variables aux
        String intPart=num.substring(0, point);
        String decPart=num.substring(point+1);

        //Output
        System.out.println("Parte entera: " + intPart);
        System.out.println("Parte decimal: " + decPart);
    }
}