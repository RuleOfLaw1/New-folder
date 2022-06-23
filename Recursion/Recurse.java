import java.util.Scanner;

    public class Recurse{
         
        public static int factorial(int num){
            if (num == 0 ) return 1;
            else
                return num * factorial(num - 1);
        };
        
        // Fib(n) = Fib(n - 1) + Fib(n - 2) for n > 2; Fib(1) = Fib(2) = 1
        // 8 = (8-1) + (7-2) + (5-3) OR (0 + 1 = 1) + (1+2 = 3) + (2+3 = 5) + (3+5 = 8) + (5+8 = 13) ...
        public static int fibonacci( int fib){
            if(fib == 0 || fib == 1)
                return fib;
            else
                return fibonacci(fib - 1) + fibonacci(fib - 2);
        };
        
        
        // Improving the fib through Memoization
        private static long fibcache[];
        private static long improvedFib(int imfib){
            if(imfib == 0 || imfib == 1)
                return imfib;
            
            
            if(fibcache[imfib] != 0)
                return fibcache[imfib];

            long nthFibNum = improvedFib(imfib - 1) + improvedFib(imfib - 2);
            fibcache[imfib] = nthFibNum;
                return nthFibNum;
        }

        public static void main(String[] args){
            /*try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Enter a positive number ...");
        
                int num = scan.nextInt();
                System.out.println("Factorial of the number is ... " + 
                    factorial(num));
            };*/
        
       
        /*try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your number ...");

            int fib = in.nextInt();
            System.out.println("Your fibonacci number is ... " + fibonacci(fib));
        };*/

        try (Scanner fScanner = new Scanner(System.in)) {
            System.out.println("Enter your number ...");

            
            int fibo = fScanner.nextInt();
            fibcache = new long [fibo + 1];
            //System.out.println("Your fibonacci number is ... " + improvedFib(fibo)); // More improvements
            for (int i = 0; i < fibo; i++) {
                System.out.println("Your fibonacci number is ... " + improvedFib(i)); // This is to print all numbers out
            }
        };
    }
};