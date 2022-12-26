package Loops.src;
public class SquaredNumbers {
    public static void main(String[] args) throws Exception {
        int squareSum = 0, sumSquares = 0;
        int diff = 0;

        for (int i = 0 ; i < 100 ; i++){
            squareSum += i;
            sumSquares += i*i;
        }
        squareSum *= squareSum;
        diff = squareSum- sumSquares;
        System.out.println(diff);
    }
}