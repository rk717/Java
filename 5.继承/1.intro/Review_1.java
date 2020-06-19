public class Review_1 {
    static class A
    {
        public static int i; 
        protected static int j; 
        private static int k; 
    }

    static class B extends A
    {
        private void g()
        {
            i = 22;  //1.在子类内部访问
            //k = 20; 报错，因为子类只能访问父类非私有的成员
        }
    }

    public static void main(String[] args)
    {
        A.i = 99;  //3.通过父类类名（必须是static和 非 private) (i 必须是 非私有 和 静态)
        //A.k = 99; //error
        
        B.i = 99; 
        //B.k = 99;  //error

        B bb = new B();
        bb.i = 99;  //2.通过子类对象名的方式访问
        //bb.k = 99; error 
    }

}

/*
子类访问父类有两种方式：
    1.在子类内部访问父类成员
    2.通过子类对象名访问父类成员
    3.通过子类类名访问父类成员（必须是static和 非 private)

经验证，子类通过上述三种方式的任何一种都无法访问父类私有成员，
因此我没可以得出结果：
    私有成员无法被子类继承
*/