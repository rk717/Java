public class TestSuper_2 {

    static class A
    {
        public int i; 
        public int j; 

        public A()
        {

        }

        public A(int i, int j)
        {
            this.i = i; 
            this.j = j; 
        }
    }

    static class B extends A
    {
        public int k; 

        public B()
        {

        }

        public B(int i, int j, int k) 
        {
            //为什么有3个参数(i, j, k)，
            //因为从A那里继承了i和j，自己又定义了一个k，
            //所以是3个参数
            
            //A(i, j);  error

            super(i, j); //使用super使用父类的构造方法

            this.k = k; 
        }
    }

    public static void main(String[] args)
    {
        B bb = new B(1, 2, 3); //造bb事物时，已经有了i，j 属性

        System.out.printf("%d %d\n", bb.i, bb.j); //1 2


    }
    
}