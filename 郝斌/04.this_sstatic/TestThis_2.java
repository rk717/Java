public class TestThis_2 {
    static class A
    {
        public int i = 99; 

        public A(int i)
        {
            this.i = i; //this代表当前时刻正在创建的对象
            System.out.printf("%d\n", i);
        }

        public void show()
        {
            System.out.printf("%d\n", this.i); //this代表正在调用show方法的对象
        }
    }

    public static void main(String[] args)
    {
        A aa = new A(2); //2

        aa.show(); //2

        //System.out.printf("%d\n", aa.i);
    }
}