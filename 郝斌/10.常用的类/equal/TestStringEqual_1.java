class A
{
    public int i; 
    public A(int i)
    {
        this.i = i; 
    }
}

public class TestStringEqual_1
{
    public static void main(String[] args)
    {
        A aa1 = new A(2);
        A aa2 = new A(2);

        System.out.println(aa1.equals(aa2)); //false
        //equals, 说明aa1和aa2的地址不相同
        //这里无法判断 aa1和 aa2 的值是否相等

        System.out.println(aa1); //A@de6ced
        System.out.println(aa2); //A@ad3234
        //aa1和aa2这里不相同
        //这里分配了四块内存，aa1 aa2, 和 2，2
    }
}