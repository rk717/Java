class A extends Thread
{
    public void run()
    {
        System.out.println("AAAA\n");
    }
}

public class TestThread_3 
{
    public static void main(String[] args) 
    {
        A aa = new A();
        aa.start(); 
        System.out.println("BBBB\n");

        //获取正在执行的线程的名字。
        System.out.printf("%s在执行\n", Thread.currentThread().getName());
    }
}