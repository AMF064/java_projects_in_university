import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        int mark;
        System.out.println("Nota: ");
        do{
        mark = in.nextInt();
        if(!(0 <= mark && mark <=20))
            System.out.println("Error, volver a introducir: ");
        } while (!(0 <= mark && mark <=20));
        in.close();

        //Output
        switch (mark){
            case 14:
            case 15:
                System.out.println("Aprobado");
                break;
            case 16:
            case 17:
                System.out.println("Notable");
                break;
            case 18:
            case 19:
                System.out.println("Sobresaliente");
                break;
            case 20:
                System.out.println("MH");
                break;
            default:
                System.out.println("Suspenso");
        }
    }
}
