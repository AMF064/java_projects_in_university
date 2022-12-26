import java.util.Scanner;
public class AgeDiscount {
   public static void main(String[] args) {
    /* APLICAR DESCUENTO SEGÚN EDAD */
    float off1 = .1f;
    float off2 = .05f;
    
    //Input
    Scanner in = new Scanner(System.in);
    System.out.println("Edad: ");
    int age = in.nextInt();
    System.out.println("Precio inicial");
    float price = in.nextFloat();
    in.close();

    //Output
    if(age < 65)
        System.out.printf("\nEl precio con descuento es de %.2f euros", price * (1-off2));
    else
        System.out.printf("\nEl precio con descuento es de %.2f euros", price * (1-off1));
   } 
}
