//第一种方法，extends Thread
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
        aa.start();
    
        while(true)
        {
            System.out.println("BBBB");
        }       
    }

}

//交替运行
/*
BBBB
BBBB
BBBB
BBBB
BBBB
BBBB
AAAA
AAAA
AAAA
AAAA
BBBB
BBBB
BBBB
BBBB
*/
