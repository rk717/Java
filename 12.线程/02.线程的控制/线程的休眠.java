/*
线程的休眠

线程休眠--暂停执行当前运行中的线程，使之进入阻塞状态，
待经过指定的“延迟时间“后再醒来并转入到就绪状态。abstract

Thread类提供的相关方法：
    public static void free(long millis)
    public static void sleep(long millis, int nanos)

由于是静态方法，可以由Thread直接调用

sleep()方法会抛出InterrruptedException异常，我们必须的对其进行捕捉。

*/

public class TestSleep
{
    public static void main(String[] args) 
    {
        A aa = new A();
        Thread tt = new Thread(aa);
        tt.start();    
    }
}

class A implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try 
            {
                Thread.sleep(1000);
                //这里的Thread.sleep(1000)会抛出异常，必须的进行捕捉
            }
            catch(Exception e)
            {

            }
        }
    }
}

/*
无论是继承Thread类的run方法还是实现Runnable接口的run方法，都不能抛出任何异常

class A implements Runnable
{
    public void run() //throws Exception //注释符不能去掉，否则编译会报错
    {
    }
}
class B extends Thread
{
    public void run() //throws Exception //注释符不能去掉，否则编译会报错
    {
    }
}

原因： 重写方法抛出异常的范围不能大于被重写方法排除的异常范围。
*/