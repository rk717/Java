public class TestPoly_2 {
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

    public static void main(String[] args)
    {

        A aa = new A();
        B bb = new B();
        
        aa = bb; //OK 儿子当爹
        //bb = aa; //error 爹不能当儿子

        bb = (B)aa; //把aa强制转化成bb
        //如果注释掉24行，则27行报错
        //因为有24行，说明aa指向了子类，所以可以强制类型转换
        //否则aa指向父类，不可以强制类型转换
        bb.f();


    }
}