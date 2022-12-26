class Results {
    public static void main(String[] args) {
        int varInt1 = 10;
        int varInt2 = 10;
        int varInt3 = 10;
        int res1 = 5-7*10+ varInt1 ;                    //res1 = 5-70+10 = 5-60 = -55;
        int res2 = 5-7*10+ varInt2++;                   //res2 = -55; res2+=1;
        int res3 = 5-7*10+ ++varInt3;                   //varInt3 += 1; res3 = 50 - 70 + varInt3 = -54;
        System.out.println( "Resultado 1: " + res1 );   //-55
        System.out.println( "Resultado 2: " + res2 );   //-55
        System.out.println( "Resultado 3: " + res3 );   //-54
        System.out.println( "varInt1: " + varInt1 );    //10
        System.out.println( "varInt2: " + varInt2 );    //11
        System.out.println( "varInt3: " + varInt3 );    //11
    }
}