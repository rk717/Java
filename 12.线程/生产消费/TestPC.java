class SynStack
{
    private char[] data = new char[6];
    private int cnt = 0; //表示数组有效的元素的个数

    public void push(char ch)
    {
        data[cnt] = ch; 
        ++cnt; 
    }

    public char pop()
    {
        --cnt; 
        return data[cnt];
    }
}

class Producer implements Runnable //生产线程
{
    private SynStack ss = null;

    public Producer(SynStack ss)
    {
        this.ss = ss; 
    }

    public void run()
    {
        //push('a'); //error 因为一个对象，永远不能实现另一个对象的方法
        ss.push('a');
    }
}

class Consumer implements Runnable //消费线程
{
    private SynStack ss = null; 

    public Consumer(SynStack ss)
    {
        this.ss = ss; 
    }

    public void run()
    {
        System.out.printf("%c\n", ss.pop());
    }
}

public class TestPC
{
    public static void main(String[] args) {
        SynStack ss = new SynStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);

        Thread t1 = new Thread(p);
        t1.start();

        Thread t2 = new Thread(c);
        t2.start();
    }
}