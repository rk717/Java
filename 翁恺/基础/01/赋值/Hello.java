import java.util.Scanner; 

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the Price: ");
        //final int amount = 100;   //常量，不可改变 
        int amount = in.nextInt();
        
        System.out.print("Please input the money you pay: ");
        int price = 0; 
        price = in.nextInt();

        System.out.println(amount + "-" + price + "=" + (amount-price));
    }
}