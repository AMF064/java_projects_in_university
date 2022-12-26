class TryConditionals{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int n1=5, n2=8;
        if ( ( !a && b ) || !( n1 > n2 ) ){     //true
        System.out.println("Resultado 1");
        }
        if ( (!a || b ) || !( n2 > n1 ) ){      //false
        System.out.println("Resultado 2");
        }
        if ( ( n1 >= n2 ) && ( a || b ) ){      //false
        System.out.println("Resultado 3");
        }                                       //Resultado 1
    }
}