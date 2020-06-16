public class TestStatic_5 {
    static class A
    {
        private static int i = 10; 

        public static void f()  //这里f 是 静态的
        {
            System.out.printf("FFFF\n");
        }

        public void g()   //这里 g 是 非静态的
        {
            f();
            System.out.printf("GGGG\n");
        }
    }

    public static void main(String[] args)
    {
        //A.g(); //错误，因为g不是静态的，不是静态的就不属于类本身，不属于类本身就必须要有对象
        A aa = new A(); 
        aa.g(); //可以通过 非静态的访问静态的； 但是静态的不能访问非静态的
    }
}