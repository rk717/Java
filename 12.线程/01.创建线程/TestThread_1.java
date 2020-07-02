class A extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("AAAA");
        }
    }
}

public class TestThread_1 
{
    public static void main(String[] args) 
    {
        A aa = new A();
        aa.run(); //aa.start(), AAAA和BBBB同时运行
                //aa.run(),依次执行。
        while (true)
        {
            System.out.println("BBBB");
        }
    }
}