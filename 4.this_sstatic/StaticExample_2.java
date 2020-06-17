public class StaticExample_2 {
    //A这个类，只造一个对象
    static class A
    {
        public int i = 20;
        
        private static A aa = new A(); 
        //必须是static，不然下面的静态的不能访问非静态的
        //aa是A对象的属性
        //定义了一个自身的对象


        private A() //private 禁止 new 对象
        {

        }

        //必须是static，如果是dynamic则只能通过对象调用get A(),但是我们没有new对象，所以static一定不可以省略
        public static A getA() //只提供一个接口getA，通过这个接口可以获取aa
        {
            return aa; 
        }

    }

    public static void main(String[] args)
    {
        A aa1 = A.getA();
        A aa2 = A.getA();

        aa1.i = 99; 
        System.out.printf("%d\n", aa2.i); //99 说明aa1 和 aa2 是一个对象

        if(aa1 == aa2)
        {
            System.out.printf("aa1 and aa2 are the same\n");
        }
        else
        {
            System.out.printf("aa1 and aa2 are the different\n");
        }

        // A aa1 = new A(); //如果A类的构造方法是private，则new A()就会报错
        // A aa2 = new A();
    }
    
}


/*
一个类的属性可以是个类对象

class A
{
    public void f()
    {
        System.out.printf("Haha\n");
    }

}

class C
{
    public int i = 10; 
    public A aa = new A(); //aa一定是个对象，aa也是C的属性

    public void g()  //g方法可以访问aa，因为类内部无论公共私有都可相护访问
    {
        aa.f(); 
    }
}

class M
{
    public static void main(String[] args)
    {
        C cc = new C();
        cc.g();   //Haha
        //cc调用g，g调用aa的f方法，输出了Haha
    }
}

*/