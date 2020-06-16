public class TestStatic_1 {
    static class A
    {
        public int i = 10; 
        //public static int i = 10;  如果加static 则 A 类的多个对象公用一个 static 属性

        public void show()
        {
            System.out.printf("%d\n", i);
        }
    }

    public static void main(String[] args)
    {
        A aa1 = new A();
        A aa2 = new A();
        A aa3 = new A();

        aa1.i = 20; 
        aa2.show(); 
        System.out.printf("%d\n", aa3.i);
    }
}