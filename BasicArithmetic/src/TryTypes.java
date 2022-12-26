class TryTypes{
    public static void main(String[] args) {
        double dGigante, dNormal, dMinimo;
        float fGigante, fNormal, fMinimo;
        dGigante = 2.87e300;
        dNormal = 20.123456789;
        dMinimo = 0.1E-200;
        fGigante = (float) dGigante;
        fNormal = (float) dNormal;
        fMinimo = (float) dMinimo;
        System.out.println("Double Gigante: " + dGigante);
        System.out.println("Float Gigante: " + fGigante);
        System.out.println("Double Normal : " + dNormal);
        System.out.println("Float Normal : " + fNormal);
        System.out.println("Double Enano : " + dMinimo);
        System.out.println("Float Enano : " + fMinimo);
        byte b1 = (byte) 128;
        byte b2 = 127;
        byte b3 = 127;
        b3++;
        short s1 = (short) -32769;
        short s2 = -32768;
        short s3 = -32768;
        s3--;
        System.out.println("Byte 1 : " + b1);
        System.out.println("Byte 2 : " + b2);
        System.out.println("Byte 3 : " + b3);
        System.out.println("Short 1 : " + s1);
        System.out.println("Short 2 : " + s2);
        System.out.println("Short 3 : " + s3);
    }
}