package 面向对象;

//访问控制符

/*
在一个类的内部，所有的成员可以相互访问，访问控制符是透明的；
访问控制符是针对外部访问而言的。

在一个类的外部：通过
    类对象名.私有成员名
的方式是无法访问该对象中的私有成员的，这样写编译时会出错。
    
*/
class A
{
    private int i; 
    public int j;
    protected int m; 

    private void f() //f 是私有的
    {
        i = 1;  //私有的内部，可以访问私有 （自己家人）
        j = 2; //私有的方法，也可以访问公有的
        m = 3; //私有的方法，可以访问该类内部的保护型的属性

        // k(); 可以访问
        // g(); 可以访问
    }

    protected void k() //k是保护型的
    {

    }

    public void g() //g是公有的
    {
        i = 1;  
        j = 2; 
        m = 3; 
        f(); //公有的可以访问私有的方法
    }
}


public class TestAccess {
    public static void main(String[] args)
    {
        A aa = new A();
        // aa.i = 10;  //不能这样写，因为 i 是私有的

        aa.j = 20; //可以，因为 j 是公有的

        aa.m = 22; //可以，因为m是protected 保护型的

        //只有私有成员不能通过类名的程序访问
        //而其他的（公有的和保护性的）可以
    }
}