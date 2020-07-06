class A
{
    public int i; 
    public A(int i)
    {
        this.i = i; 
    }

    public boolean equals(Object obj)
    {
        A aa = (A)obj; // 转换 Object 类型到 A 类型

        if(this.i == aa.i)// if(当前对象的i和obj代表的i相等)
            return true; 
        else
            return false;
  
    }
}

public class TestStringEqual_2
{
    public static void main(String[] args)
    {
        A aa1 = new A(2);
        A aa2 = new A(2);

        System.out.println(aa1.equals(aa2)); //true 
        //原本是false因为 aa1 和 aa2 的地址不相同
        //所以我们需要重写equals,才可以比较aa1和aa2的值是否相同
    }
}