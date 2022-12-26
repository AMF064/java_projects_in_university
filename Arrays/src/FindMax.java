public class FindMax {
    public static void main(String[] args) throws Exception {
        //Generate the array
        int[] a = new int[100];
        for(int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        //Find the largest number
        int max = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
        System.out.println(max);
    }
}
