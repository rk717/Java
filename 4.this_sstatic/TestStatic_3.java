public class TestStatic_3 {
    static class A
    {
        public static int i = 10; 

        public static void f()
        {
            System.out.printf("2020/6/16\n");
        }
    }

    public static void main(String[] args)
    {
        A aa = new A();
        //A.f();
        aa.f();
        System.out.printf("%d\n", aa.i);
    }
}

// 2020/6/16
// 10

/*
Static 属性和方法虽然属于类本身，虽然可以通过类名的方式访问
但是，static属性和方法很明显也属于类对象，
当然也可以通过类对象名的方式访问

*/