public class TestOver_4 {
    static class A
    {
        public void f()
        {
            System.out.printf("AAAA\n");
        }
    }

    static class B extends A
    {
        public int f() //error, 类型必须相同，int 需要 改成 void
        {
            System.out.printf("BBBB\n");
        }
    }

    public static void main(String[] args)
    {
        B bb = new B(); 
        bb.f(); //AAAA HaHa BBBB  
    }   
}