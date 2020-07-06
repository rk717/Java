interface It
{
    //public abstract void f();
    void f(); //前面的public abstract 可以省略
}

class A implements It
{
    public void f()
    {
        System.out.printf("AAAA");
    }

    public void g()
    {

    }
}

public class D 
{
    public static void main(String[] args)
    {
        //int i; 
        It it; 
        it = new A();  //或者 It it = new A()
        it.f();  //AAAA

        //it.g();通过接口引用只能调用从父类继承的，不能调用自己独有的。

        // It it2 = new It(); //error
    }
}