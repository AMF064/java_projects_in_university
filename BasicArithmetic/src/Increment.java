class Increment {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++);        //0 y después suma 1
        System.out.println(i);          //1
        System.out.println(++i + i--);  
        /*4: suma 1 (ahora son 2), 
        se suma a sí mismo y después resta 1 (y vuelve a ser 1)*/
        System.out.println(i);          //1
    }
}