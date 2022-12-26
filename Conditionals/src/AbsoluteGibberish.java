class Ej5 {
    public static void main(String[] args) {
        int n = 3;
        boolean b = n/3+2*2>n--&&++n>=3||n++<n%3;   //true
        /*Hay un ++n, entonces la expresión se evalúa con n = 4*/
        System.out.println(b);
    }
}