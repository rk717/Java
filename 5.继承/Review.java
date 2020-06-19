public class Review
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
        public void f()  //重写方法的权限不能低于被重写方法的访问权限
        {
            super.f();
            System.out.printf("BBBB\n");
        }
    }

    public static void main(String[] args)
    {
        B bb = new B(); //里面有两个f()
        //在B里继承了A类的方法，在B类里又重新定义了一个方法，两个方法同名同参
        bb.f(); //AAAABBBB

        aa = bb; //子类可以当作父类 
        //bb = aa; //父类不可以当作子类

        aa.f(); //BBBB  *aa.f(); 
    }

    /*
        java里的overwrite
        子类里并不是修改了父类的方法
        是继承了，然后子类，自己又写了一个新的
        但是两个方法是同名同参
    */

}