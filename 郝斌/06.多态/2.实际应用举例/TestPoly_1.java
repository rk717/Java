public class TestPoly_1 {
    static class A
    {
        public void f()
        {
            System.out.printf("AAAA\n");
        }
    }

    static class B extends A
    {
        public void f()
        {
            System.out.printf("BBBB\n");
        }
    }

    static class c extends B
    {
        public void f()
        {
            System.out.printf("CCCC\n");
        }
    }

    public static void g(A aa)
    {
        aa.f(); //(*aa).f(); 类似于C语言
    }
    public static void main(String[] args)
    {
        //总共分配了6个内存、
        //栈里aa bb cc
        //堆里new A() new B() new C()
        A aa = new A();
        B bb = new B();
        C cc = new C();

        g(aa); //AAAA
        g(bb); //BBBB  
        //把bb发送给aa 多态
        //把bb的地址赋给了aa就相当于之前的aa=bb
        g(cc); //CCCC
    }
}