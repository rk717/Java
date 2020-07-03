/*
    用创建线程的第一种方式 来买票
    用extends Thread
    创建两个对象，两个线程，但是需要公用的tickets，所以tickets前面需要加static
    本程序运行OK
*/

class A extends Thread
{
    public static int tickets = 100; 
    public static String str = new String("Haha"); //需要static

    public void run() //void 前面不能加 synchronized, 因为这样会导致只有一个售票点在卖票
    {
        //synchronized 也不能加在这里，因为这样只会有一个窗口卖票
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

public class TestTickets_2
{
    public static void main(String[] args) 
    {
        A aa1 = new A();
        aa1.start();

        A aa2 = new A();
        aa2.start();
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