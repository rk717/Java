class A
{
    public void f() //如果在public前面就final，则编译时就会报错，因为final不能被子类改写，只能被子类继承。
    {
        System.out.println("AAAA\n"); 
    }
}

class B extends A
{
    public void f()
    {
        System.out.println("BBBB\n");
    }
}

public class TestFinal_2 
{
    public static void main(String[] args)
    {

    }    
}