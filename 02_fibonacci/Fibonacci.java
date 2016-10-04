public class Fibonacci{
    public static void main (String[] arg)
    {      
        //define variables sum, fib1, fib2
        int sum = 0;
        int firstFib = 1;
        int secondFib = 1;

        // while (sum of fibs less than 1000) loop
        while (secondFib < 4000000)
        {
            // if the new fib is even add to sum
            if (secondFib % 2 == 0)
            {
                sum += secondFib;
            } //end if

            //assign the secondFib with the addition of the two current Fib numbers
            secondFib = secondFib + firstFib;
            //assign the firstFib with the new fibonacci number minus the old firstFib.
            firstFib = secondFib - firstFib;
        } //end while

    System.out.println(sum);

    }// end main
}
