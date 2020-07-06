//测试stringlei的valueOf方法的用法

public class TestString_2
{
    public static void main(String[] args)
    {
        int i = 123; 
        String str = "456";
        str = String.valueOf(i); //把int变成str
        System.out.printf("str = %s\n", str);

        i = Integer.parseInt(str); //把str变成int
        System.out.printf("i = %d\n", i); 
    }
}