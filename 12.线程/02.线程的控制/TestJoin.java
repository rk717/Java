public class TestJoin 
{
    public static void main(String[] args) 
    {
        MyRunner r = new MyRunner();
        Thread t = new Thread(r);
        t.start();
        try
        {
            t.join();
        }    
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        for(int i = 0; i < 50; i++)
        {
            System.out.println("主线程： " + i);
        }
    }    
}

class MyRunner implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 50; i++)
        {
            System.out.println("子线程： "+i);
        }
    }
}

//子线程执行完毕，才会执行主线程

/*
10行的t.join();暂停当前正在执行
t.join()的线程，直到t所对应的线程运行终止之后，
当前线程才会获得继续执行的机会
注意：
    t.join()不是暂停t对象所对应的线程。
*/