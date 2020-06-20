interface It
{
    //可以省略public static final 和 public abstract
    public static final int i = 20;
    public abstract void f();
}

interface It2
{
    int i = 20; 
    void f();
}

abstract class A implements It2  //A 继承接口 需要 implements 包含过来,加abstract是因为 It2 调用了 void f(), 这是个abstract 
{
    public void f()
    {
        System.out.printf("i = %d\n", i); 
    }
}

public class B
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.f(); // i = 20 
    }
    
}

/*
implements 不能改为extedns，因为类可以继承类，但是类不能继承接口，类只可以实现接口
*/