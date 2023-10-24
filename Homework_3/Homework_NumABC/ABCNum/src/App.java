import Homework_tools.numberStuff;


public class App {
    public static void main(String[] args) throws Exception 
    {
        for (int i = 100; i < 1000; i++) 
        {
            //number to digits
            int[] digits = numberStuff.numberToDigitsArray(i);

            int a = digits[0];
            int b = digits[1];
            int c = digits[2];

            //Conditions numbers
            int abc = a * 100 + b * 10 + c;
            int cba = c * 100 + b * 10 + a;
            int ab = a * 10 + b;
            int bc = b * 10 + c;
            int cb = c * 10 + b;
            int ba = b * 10 + a;

            if (cba > abc && numberStuff.isPrime(abc) && numberStuff.isPrime(cba) && numberStuff.isPrime(ab) && numberStuff.isPrime(bc) && numberStuff.isPrime(cb) && numberStuff.isPrime(ba))   
            {
                System.out.println(i);
            }
        }
    }
}
