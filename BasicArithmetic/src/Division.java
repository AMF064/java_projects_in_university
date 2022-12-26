class Division {
    public static void main(String[] args) {
        final int CONST=53;
        int op1;
        int op2;
        int op3;
        int cocienteDivision;
        int restoDivision;
        //inicializa op1 con el valor 1
        op1 = 1;
        //inicializa op2 con el valor 5
        op2 = 5;
        //suma 8 a op1
        op1 += 8;
        //resta 10 a op2
        op2 -= 10;
        //multiplica op1 y op2 y guarda el resultado en op3
        op3 = op1*op2;
        //suma CONST a op3
        op3 += CONST;
        //Halla el cociente de dividir op3 entre 3 y guardalo en cocienteDivision
        cocienteDivision = op3/3;
        //Halla el resto de dividir op3 entre 3 y guardalo en restoDivision
        restoDivision = op3 % 3;
        /*Muestra por pantalla los valores de op1, op2, op3, cocienteDivision y restoDivision en
        * lineas separadas
        */
        System.out.printf("%d\n%d\n%d\n%d\n%d", op1, op2, op3, cocienteDivision, restoDivision);
    }
}