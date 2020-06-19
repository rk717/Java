public class TestPoly_3 {
    static class A
    {
        public void f()
        {
            System.out.printf("AAAA\n");
        }
    }

    static class B extends A
    {
        public void f()  //继承父类A，重写的f
        {
            System.out.printf("BBBB\n");
        }

        public void g() //自己写的g
        {
            System.out.printf("GGGG\n");
        }
    }

    public static void main(String[] args)
    {

        A aa = new A();
        B bb = new B();

        aa = bb; 

        //aa.g(); error 
        //父类可以调用子类从父类继承过来的，或者重写的方法，
        //但是 父类不可调用子类独有的方法，因为不安全

        
        
        


    }
}