//创建线程的第二种方法

class A implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("AAAA\n");
        }
    }
}

public class TestThread_2 
{
    public static void main(String[] args) 
    {
        A aa = new A();
        //aa.start(); //error
        Thread t = new Thread(aa); //

        t.start();

        while (true) 
        {
            System.out.println("BBBB\n");    
        }
    }    
}

/*
-定义一个实现了Runnable接口的类，假定为A
-创建A类对象aa，代码如下
    A aa = new A();

-利用aa构造一个Thread对象tt，
    Thread tt = new Thread(aa);

-调用tt中的start方法
    tt.start();
*/