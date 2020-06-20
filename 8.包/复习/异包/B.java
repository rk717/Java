package com.ruide; 
import zhangsan.lisi.*;

class B extends A
{
    public void f()
    { 
        g(); //OK
        b(); //OK 在子类内部可以访问从另一个包继承过来的父类的public和protected成员
    }
}

class M
{
    public static void main(String[] args)
    {
        B bb = new B();

        //bb.f(); //GGGG BBBB

        //bb.g(); //OK

        bb.b(); //error, 在子类的外部不能单独访问protected类型，只能访问public。
    }
}