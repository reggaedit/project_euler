public class multiples{
    public static void main(String[] arg)
    {
        //define vars
        int sum = 0;
        int iterations = 1000;

        //iterate through x numbers
        for (int i = 1; i < iterations; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }
        //test if multiple of 3 or 5
        //add to sum
        System.out.println(sum);
    }
}
