class Casting {
    public static void main(String[] args) {
        double varDouble;
        float varFloat;
        long varLong;
        int varInt;
        short varShort;
        byte varByte;
        varFloat = 33000.51f;
        varDouble = varFloat;
        varLong = (long) varFloat;
        varInt = (int) varFloat;
        varShort = (short) varFloat;
        varByte = (byte) varFloat;
        System.out.printf("%f\n%f\n%d\n%d\n%d\n%d\n", varDouble, varFloat, varLong, varInt, varShort, varByte);
    }
}