import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random()*100+1); //会给我们一个1到100之间的数

        int a; 
        int count = 0; 
        do{
            a = in.nextInt();
            count += 1; 
            if(a > number)
            {
                System.out.println("bigger");
            }
            else if( a < number)
            {
                System.out.println("smaller");
            }
        }while(a != number);
        System.out.println("Congratulation, you are correct, you guessed "+count+" times");

    }
}