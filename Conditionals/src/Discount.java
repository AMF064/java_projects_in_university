class Discount {
    public static void main(String[] args) {
        int edad; //años
        int partes; //cantidad de partes que ha dado
        boolean principiante; //si tiene la L
        boolean rebaja;
        //inicialización de edad, partes y principiante para pruebas
        edad = 23;
        partes = 5;
        principiante = true;
        //rebaja=expresión booleana
        rebaja = (edad < 40 && edad >= 28 && partes <= 2) || (edad >= 18 && edad < 28 && !principiante && partes <= 1)
        || (edad >= 40 && edad < 60 && partes <= 4);
        System.out.println("Rebaja= "+rebaja);
    }
}