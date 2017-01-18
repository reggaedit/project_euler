public class PrimeFactor
{
    public static void main (String[] arg)
    {
        //define vars
        int prime = 2;
        int num = 100;
        int max_prime = 2;
        //generate primes, divide num by each prime
        for (int i = 1; i<num; i++)
        {
            boolean isPrimeNumber = true;
        
            //check to see if the number is a prime
            for(int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrimeNumber= false;
                    break;//exit inner for loop
                }
            }
            if (num%prime = 0)
            {
                maxPrime = i;
            }
            
        }//end for
    }//end main
}
