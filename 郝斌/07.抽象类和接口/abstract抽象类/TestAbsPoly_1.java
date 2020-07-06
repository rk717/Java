//构建抽象类的多态实现
 
abstract class A
{
    abstract public void f();
}

class B extends A  //父类是抽象的，子类也是抽象的;或者实现父类的抽象体
{
    public void f() // 因为这里实现了f()方法，所以class B前面不需要加 abstract
    {
        System.out.printf("BBBB\n");
    }
}


public class TestAbsPoly_1 
{
    public static void main(String[] args)
    {
        //A aa = new A(); error,因为是抽象的。
    
        B bb = new B(); //OK
        bb.f(); //OK

        A aa; //OK 可以定义一个抽象类的引用。但是不可以定义一个抽象类的对象，所以21行error, 和本行OK
        aa = bb; 
        aa.f(); //BBBB 利用了多态
    
    }
}