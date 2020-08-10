/*
对象的操作
    String s = "hello";
    int i = s.length();
    System.out.println(s + "bye");
    这些都是对象在执行函数
*/
import java.util.Scanner;
public class Main 
{
    public static boolean isPrime(int i)  //函数
    {
        boolean isPrime = true;
        for(int k=2; k<i; k++)
        {
            if( i%k == 0)
            {
                isPrime = false; 
                break; 
            }
        }
        return isPrime;
    }    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if(m==1) m=2;
        int cnt=0;
        int sum=0;
        for(int i = m; i <= n; i++)
        {
            if(isPrime(i))  //调用函数
            {
                cnt++;
                sum += i;
            }
        }
        System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数，总和为"+sum);
    }
}