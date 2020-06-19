public class TestOver_3 {
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
        B bb = new B(); 
        bb.f(); //AAAA HaHa BBBB  
    }
}

/*
如果想重写父类
    子类权限需要高于父类权限

如果要重写：
    名字和形参一定要相同
*/