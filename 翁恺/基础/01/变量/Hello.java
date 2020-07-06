import java.util.Scanner; 

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price; 
        price = in.nextInt();

        System.out.println("100-"+price+ "=" + price);
    }
}

/* 
变量定义：
    变量定义的一般形式是：
        <类型名称>, <变量名称>

    int price;
    int amount; 
    int price, amount; 
*/