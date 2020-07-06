interface It
{
    // public void f()  error, 接口不能带有主体。
    // {

    // }

    int i = 20;  //属性
    public void f(); //接口里可以有抽象的方法

    //接口就是抽象方法和常量值的集合。
    //从本质上讲，接口是一种特殊的抽象类。

    //可以省略public static final 和 public abstract
    //public static final int i = 20;
    //public abstract void f();
}


abstract class B
{
    public void f() //抽象类里可以有一个非抽象方法
    {


    }
}

public class A 
{
    public static void main(String[] args)
    {

    }
    
}