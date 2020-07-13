//构造素数表
//算法不一定和人的思考方式相同

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[100];
        for(int i=2; i < isPrime.length; i++)
        {
            isPrime[i] = true; 
        }

        for(int i = 2; i < isPrime.length; i++)
        {
            if(isPrime[i])
            {
                for(int k = 2; i*k < isPrime.length; k++)
                {
                    isPrime[i*k] = false; 
                }
            }
        }
        for(int i = 0; i < isPrime.length; i++)
        {
            if(isPrime[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}