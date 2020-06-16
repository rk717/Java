public class TestStatic_4 {
    static class A
    {
        public static int i = 10; 

        private static void f()
        {
            System.out.printf("2020\n");
        }
    }

    public static void main(String[] args)
    {
        //A.f(); 无法访问 因为 private
        A.i = 22; 
    }
}

/*
只有非private的static成员才可以通过类名的方式访问，
static只是表明了该成员具有了可以通过类名访问的潜在特征，
但是否可以通过类名访问，还必须满足一个条件： 该成员必须是非private
*/