package Loops.src;
public class PrimesProduct {
    public static void main(String[] args) {
        /* PRODUCT OF ALL THE PRIME NUMBERS BETWEEN 1 AND 10 */
        int num = 1;
        for(int i = 1; i <= 10 ; i++){      //Go through the numbers from 1 to 10
            int j;
            for(j = 2 ; j <= i ; j++){      //Find a number between 2 and i which is divisible by i
                if (i % j == 0)
                break;
            }
            if (j == i)                     //Condition for it to be prime
                num *= i;
        }
        System.out.println(num);
    }
}
