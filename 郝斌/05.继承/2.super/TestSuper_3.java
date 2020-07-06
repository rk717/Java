public class TestSuper_3 {

    static class A
    {
        public int i; 

        public A(int i)
        {
            this.i = i; 
        }
    }

    static class B extends A
    {
        public int j; 

        public B(int i, int j)
        {
            super(i); 
            //必须写super(i), 如果不写，则会自动调用super()
            //super()会报错，因为有参数i，但是super()没有任何参数。
            this.j = j; 
        }

        public void f(int i)
        {
            //super(i); error, 
            //因为对super的调用必须是构造函数中的第一个语句
            //只能是在 B 的 constructor 里 使用
            //普通方法中不能调用父类的构造方法
        }
    }

    public static void main(String[] args)
    {
        

    }
    

    /*
        只要父类的 constructor 不是 无参 的
        则 必须 要写 super（***）
        不然，子类 的 constructor 会自动 调用 super()
        而且 这个 super 必须写在 子类 的 constructor 的 第一行

        调用父类的constructor必须借助于super，不能直接写父类的名

        一个子类构造函数，不能写多个super()语句
    */
}