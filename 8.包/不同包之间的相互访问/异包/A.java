package zhangsan.lisi;

public class A  //只有public才可以被别的包访问
{
    public void f()  //只有public class 的 public 成员 才可以被别的包访问
    {
        System.out.printf("AAAA");
    }
}