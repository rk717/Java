class A extends Exception
{

}

class B extends A
{

}

class C extends B
{

}

class M
{
    public void compare(int i, int j) throws A, B
    {
        if(i > j)
            throw new A();
        else
            throw new B();
    }
}

public class TestTryCatch
{
    public static void main(String[] args)
    {
        M mm = new M();
        try 
        {
            mm.compare(-4, 1);
        }
        catch(B bb)
        {
            System.out.println("The left cant smaller than right. \n");
        }
        catch(A aa)
        {
            System.out.println("The left cant bigger than right.\n");
        }
    }
}

//先捕获子类异常，再捕获父类异常

/*
所有的catch只能有一个被执行

有可能所有的catch都没有被执行

先catch子类异常再catch父类异常
    如果先catch父类异常再catch子类异常，则编译时会报错

catch与catch之间是不能有其他代码的。

重写方法抛出异常的范围不能大于被重写方法抛出的异常范围
*/