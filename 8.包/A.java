package zhangsan.lisi; 
//package语句必须得是第一条
//package zhangsan.lisi表示：把该文件中所有的类放入zhangsan.lisi这个包中，
//并且该文件中所有的类真正的名字都是包名和类名的组合


class A
{
    public void f()
    {
        System.out.printf("AAAA\n");
    }
}

class M
{
    public static void main(String[] args)
    {
        // A aa = new A();
        // aa.f();

        new A().f(); //AAAA 效果和上面的一样
    }
}


//javac -d. 手动建立包层