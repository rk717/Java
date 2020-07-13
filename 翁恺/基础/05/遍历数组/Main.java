import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {3, 2, 5, 7, 4, 9, 11, 34};

        int x = in.nextInt();

        //普通的for循环
        int loc = -1; 
        for(int i = 0; i < data.length; i++)
        {
            if( x == data[i])
            {
                loc = i; 
                break; 
            }
        }

        //for each 循环
        boolean found = false; 
        for(int k : data)
        {
            if(k == x)
            {
                found = true;
            }
        }


        if(loc > -1)
        {
            System.out.println(x + " is the " + (loc+1) +" th number");
        }
        else
        {
            System.out.println(x+" is not inside");
        }

        
    }
}