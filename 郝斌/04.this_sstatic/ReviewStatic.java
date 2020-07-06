public class ReviewStatic {
    static class A
    {
        public int i = 10; 
        public static int j = 20; 
        //static 表示对象aa1 和 aa2 公用一个属性 j

        /*
            public void f()
            {
                j = 88; 
            }
            //f是dynamic， j是static，dynamic可以访问static，因为dynamic说明有对象了
        */

        /*
            public static void f()
            {
                j = 88; 
            }
            //static 可以 访问 static， 静态的可以访问静态的
        */

        /*
            public static void f()
            {
                i = 88; 
            }
            //不可以，因为static不能访问dynamic，因为static可能没有对象，但是dynamic必须要有对象访问才可以
        */

    }

    public static void main(String[] args)
    {
        // A aa1 = new A();
        // A aa2 = new A();
        // aa1.j = 40; 

        // System.out.printf("%d\n", aa2.j); //40 

        System.out.printf("%d\n", A.j); // 20 
        //非私有的静态成员可以通过类名来进行访问
        //System.out.printf("%d\n", aa1.j); （对象名也可以)
    }
}