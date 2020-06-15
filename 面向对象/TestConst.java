public class TestConst 
{
    static class A  //class A 用 static 是因为 class A 不在 TestConst object 里
    {
        private int i; 
        private int j; 

        //构造函数
        public A(int a, int b)
        {
            i = a; 
            i = b; 
            System.out.printf("No parameter function has been declare!\n");
        }

        public void show()
        {
            System.out.printf("i = %d, j = %d\n", i, j);
        }

    }
    public static void main(String[] args)
    {
        A aa = new A(1, 2); 
        
        //System.out.printf("%d %d\n", aa.i, aa.j);
    
        aa.show();
    }
}

/*
System 是个 class，
out 是 System 的一个 static attribute，
printf 是 out 的 method

String 是 class，args 是 parameter
*/