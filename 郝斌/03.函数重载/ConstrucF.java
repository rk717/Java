//构造函数
public class ConstrucF {
    static class A
    {
        public int i; 
        public boolean flag; 

        public void show()
        {
            System.out.printf("%d\n", i); //0
            System.out.printf("%b\n", flag); //false
        }
    }    

    public static void main(String[] args)
    {
        A aa = new A();
        aa.show();

        // int k; //局部变量，编译器不会自动进行初始化
        // System.out.printf("%d\n", k);
    }
}