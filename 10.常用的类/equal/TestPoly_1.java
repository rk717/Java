//复习多态

class A
{
    public void f()
    {
        System.out.printf("AAAA\n");
    }
}

class B extends A
{
    public void f()
    {
        System.out.printf("BBBB\n");
    }

    public void g()
    {
        System.out.printf("Success\n");
    }
}

public class TestPoly_1
{
    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        aa = bb; 
        aa.f();  //BBBB
        
        //aa.g(); //error 多态里面，父类引用可以调用子类重写父类的方法，
                //但是父类引用不能调用子类特有的方法

    //父类引用永远不可能直接赋给子类引用
    //只有在父类引用本身指向的就是一个子类对象时， aa = bb
    //才可以把父类引用强制转化为子类引用
        B bb2 = (B)aa; 
        bb2.g();
    }
}