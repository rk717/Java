/*
    第二种方式，
    用 implements Runnable
    定义一个对象，用这个对象可以造出好多个线程，这些线程公用一个资源
*/

class A implements Runnable
{
    public static int tickets = 100; //这里的static可以不加，因为后面的线程公用一个对象 
    String str = new String("Haha");

    public void run()
    {
        while (true)
        {
            synchronized(str) //如果当前线程可以霸占str，就可以执行下面的代码，所以str只能一次被一个线程霸占
            {
                if(tickets > 0)
                {
                    System.out.printf("%s线程正在卖出第%d张票\n",
                    Thread.currentThread().getName(), tickets);
                    --tickets; 
                }
                else
                {
                    break; 
                }
            }
        }
    }
}

public class TestTickets 
{
    public static void main(String[] args) 
    {
        A aa = new A();
        Thread t1 = new Thread(aa);
        t1.start();

        Thread t2 = new Thread(aa);
        t2.start();
    }
}

////////////////////////
/*
if(票数大于零)
{
    买票
    票数减1
} 
*/