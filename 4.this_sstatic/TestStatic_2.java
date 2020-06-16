public class TestStatic_2 
{
    static class A
    {
        public static int i = 10; 
        //static 属性 i 是 属于 类本身，
        //或者讲：没有对象，我们仍然可以直接访问该类内部的static属性
        //static 方法 f 同理
        
        public static void f()
        {
            System.out.printf("2020/6/16");
        }
    
    }    

    public static void main(String[] args)
    {
        System.out.printf("%d\n", A.i);
        A.f();
    }
}