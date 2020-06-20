class A
{
    int i; 

    public void show()
    {
        System.out.printf("show->%d\n", i); //i 属于属性i，此时的i等于 this.i
    }

    // public void f()
    // {
    //     int i; //这里的i和属性i没有冲突
    //     System.out.printf("f->%d\n", i);  error，因为 i 既不是 属性，也不是 形参，所以必须要初始化。
           //因为i是局部变量，Java要求局部变量在使用之前必须得初始化
    // }

    public void g(int i) //i 是形参 i，形参i也是局部变量
    {
        this.i = i; 
        System.out.printf("g->%d\n", i);
    }
}

public class E 
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.g(99); // g->99
    }    
}