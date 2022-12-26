public class OrderedArray {
    public static void main(String[] args) {
        int[] a = {1,4,7,9,13}, b = {2,5,6,10,12};

        //Generate new array
        int[] c = new int[a.length + b.length];
        /* Fill the array:
         * the conditional expressions are put in that order because the arrays' index always starts in 0,
         * so in order to order the numbers from smallest to biggest, c[0] must have the smallest number
         * of the two arrays we are reading data from.
         */
        for(int i = 0; i < a.length; i++){
            c[2*i] = (a[i] < b[i] ? a[i] : b[i]);       //Fill even positions
            c[2*i + 1] = (a[i] > b[i] ? a[i] : b[i]);   //Fill odd positions (opposite conditional expression)
        }
        for(int i : c)
            System.out.println(i);
    }
}
