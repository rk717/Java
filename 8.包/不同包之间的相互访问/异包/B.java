package com.ruide;

//import zhangsan.lisi.*; 
import zhangsan.lisi.A;  //也可以只导用特定的类，一般用这个，因为更清楚用的哪个类

class B
{
    public static void main(String[] args)
    {
        //zhangsan.lisi.A aa = new zhangsan.lisi.A(); 太长了，所以一般我们用import
        A aa = new A();
        aa.f();
    }
}