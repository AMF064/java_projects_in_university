import java.util.Scanner;

public class NameSurname {
    public static void main(String[] args) {
        /* LEER NOMBRE Y APELLIDOS SEPARADOS POR ESPACIO Y DEVOLVER INICIALES */
        
        //Input
        Scanner in = new Scanner(System.in);
        System.out.println("Nombre y apellidos, separar con espacio: ");
        String fullName = in.nextLine();
        in.close();

        //Helpers
        int firstSpace = fullName.indexOf(' ');
        int secondSpace = fullName.lastIndexOf(' ');
        String name = fullName.substring(0, 1);
        String firstSurname = fullName.substring(firstSpace + 1, firstSpace + 2);
        String secondSurname = fullName.substring(secondSpace + 1, secondSpace + 2);
        
        //Output
        System.out.println(name + firstSurname + secondSurname);
    }
}
