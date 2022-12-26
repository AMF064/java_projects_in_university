public class SameContent {
    public static void main(String[] args) {
        String str1 = "Hola, mi nombre es Pepe";
        String str2 = "Pepe";

        if (str1.endsWith(str2))
            System.out.println("Acaban igual");
        else
            System.out.println("Acaban distinto");

    }
}
