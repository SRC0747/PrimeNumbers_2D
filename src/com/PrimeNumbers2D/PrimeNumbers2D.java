package com.PrimeNumbers2D;

public class PrimeNumbers2D {
    public static boolean isPrime(int number)
    {
        boolean status=true;
        for(int n=0;n<=number;n++)
        {
            int count=0;
            for(int i=1;i<=number;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                status=true;

            }

        }
        return status;
    }
    public static Integer[] findPrimeNumbers(int start,int end)
    {
        ArrayList<Integer> primes=new ArrayList<>();
        for(int from=start;from<=end;from++)
        {
            if(isPrime(from))
            {
                primes.add(from);
            }

        }
        return primes.toArray( new Integer[primes.size()]);
    }
    public static void main(String[] args)
    {
        int[][] primeGroups=new int[10][];
        for(int i=0;i<10;i++)
        {
            int start=0;
            int end=100;
            for(int j=0;j<1000;j++)
            {
                primeGroups[i][j]=findPrimeNumbers(start, end);

            }
            start=end+1;
            end=end+100;
        }

    }
}
