import java.util.Scanner; 

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = 1; 
        for(int i = 2; i <= a && i <= b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i; 
            }
        }
        System.out.println(a+" and "+b+" gcd is: "+gcd);
    }
}

/*
枚举
    1.设i为2；

    2.如果a和b都能被i整除，则记下这个i

    3.i加1后重复第二步，指代i等于a或b；

    4.那么，曾经几下的最大的可以同时整除a和b的i就是gcd。

*/