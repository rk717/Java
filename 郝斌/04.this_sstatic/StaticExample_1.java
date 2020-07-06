public class StaticExample_1 {
    static class A
    {
        private int i;
        
        private static int cnt = 0; //需要静态的，因为所有对象共用一个cnt就可以

        public A()
        {
            ++cnt; 
        }

        public A(int i)
        {
            this.i = i; 
            ++cnt; 
        }

        //查看当前建造了几个对象
        public static int getCnt()
        {
            return cnt; //返回的是A对象的个数
            //不可以写 this.cnt, 因为cnt是静态的，只有一个，属于类
        }
    }

    public static void main(String[] args)
    {
        System.out.printf("Now, there amount of Project A: %d\n", A.getCnt());
        A aa1 = new A();
        System.out.printf("Now, there amount of Project A: %d\n", A.getCnt());
        A aa2 = new A();
        System.out.printf("Now, there amount of Project A: %d\n", A.getCnt());
    }
}