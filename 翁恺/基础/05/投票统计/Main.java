/*
    写一个程序，输入数量不确定的【0，9】范围内的整数，
    统计每一种数字出现的次数，输入-1表示结束。
*/
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x; 
        int[] numbers = new int[10];  //创建数组
        x = in.nextInt();
        while(x != -1)
        {
            if(x >= 0 && x <= 9)
            {
                numbers[x]++; //数组参与运算
            }
            x = in.nextInt();
        }
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(i+" : "+numbers[i]);
        }
    }
}