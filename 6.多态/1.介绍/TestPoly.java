public class TestPoly
{
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
            //B重写了父类A
            System.out.printf("BBBB\n");
        }
    }

    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();

        aa.f(); //AAAA
        bb.f(); //BBBB

        aa = bb; //把bb当成aa来看待 子类可以当父类看待，比如可以把狗当作动物
        //bb = aa;  //把aa当作bb来看待，父类不可以当作子类来看，比如动物不能当作狗
        //儿子可以变成爹，爹不能变成儿子

        aa.f(); // BBBB
        //这时候aa调用了bb 的 方法

    }
}

//Java polymorphism