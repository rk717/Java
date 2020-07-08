import java.util.Scanner; 

public class Test{
    public static void main(String[] args) {
        //初始化
        Scanner in = new Scanner(System.in);
        
        //读入投币金额
        System.out.print("Please give the coin: ");
        int amount = in.nextInt();

        if(amount >= 10){
            //打印车票
            System.out.println("*****************");
            System.out.println("Price: 10$");
            System.out.println("*****************");

            //计算并打印找零
            System.out.println("Change: " + (amount - 10));
        }       
    }
}