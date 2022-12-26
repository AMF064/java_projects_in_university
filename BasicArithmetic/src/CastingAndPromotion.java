class CastingAndPromotion {
    public static void main(String[] args) {
        long varLong;
        int varInt;
        short varShort;
        byte varByte;
        varInt = 33000;
        varLong =  varInt;          //Promoción
        varShort = (short) varInt;  //Casting
        varByte = (byte) varInt;    //Casting
        System.out.printf("%d\n%d\n%d\n%d\n", varInt, varLong, varShort, varByte);
    }
}