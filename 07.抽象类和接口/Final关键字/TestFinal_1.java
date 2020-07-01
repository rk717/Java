class A
{
    final public int i; // = 10; //常变量；相当于C语言里的const

    //因为final所以 i 只能被赋值一次。

    public A()
    {
        i = 22; //可以在constructor给i赋值
    }

    public void f()  //不一定调用f(),如果不调用，则 i 就没有值
    {
        //i = 22; 
    }
}

public class TestFinal_1 
{
    public static void main(String[] args)
    {

    }    
}