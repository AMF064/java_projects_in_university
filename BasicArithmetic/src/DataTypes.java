class DataTypes{
    public static void main(String[] args) {
        //Declaraciones
        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;

        //Inicializaciones
        varByte = 20;
        varShort = 2000 ;
        varInt = 2000000 ;
        varLong = 85000000L ;
        varFloat = 10.0E4F ;
        varDouble = 0.123456789e9;
        //explicar las conversiones implícitas que ocurren a continuación
        //y realizar las conversiones explícitas necesarias
        varInt = varShort;      //Promoción int <= double.
        varDouble = varFloat;   //Promoción double <= float
        varFloat = varLong;     //Promoción float <= long. Mismo tamaño.
        varLong = varInt;       //Promoción long <= int
        varByte = (byte) varShort;      //Casting byte <= short. Pérdida. Declaración implícita.
        varShort = (short) varInt;      //Casting short <= int. Pérdida. Declaración implícita.
        System.out.println(varByte + ' ' + varDouble);
    }
}