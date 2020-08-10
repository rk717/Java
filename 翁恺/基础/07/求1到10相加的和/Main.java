import java.util.Scanner;
public class Main 
{
    public static void sum(int a, int b)  //void是返回类型 sum是函数名 a，b是参数
    {
        int i; 
        int sum;
        sum = 0; 
        for(i = 0; i <= b; i++)
        {
            sum += i; 
        }
        System.out.println(a+"到"+b+"的和是"+sum);
    }    

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        sum(1,10);
        sum(20,30);
        sum(35,45);
    }
}