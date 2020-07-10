import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0; 
        while(number > 0)
        {
            number = number / 10; 
            count += 1; 
        }
        System.out.println(count);
        
    }
}