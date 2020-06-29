class A //类：是一个事物的静态属性，和动态可以操作的一个结合
{
    public String toString()
    {
        return "haha";
    }
}

public class TestObject
{
    public static void main(String[] args)
    {
        A aa = new A();
        System.out.printf("%s\n", aa.toString()); //haha
    }
}