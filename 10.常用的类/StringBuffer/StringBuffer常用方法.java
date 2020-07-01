重载方法public StringBuffer append(...) 可以为该
StringBuffer 对象添加字符序列，返回添加后的StringBuffer对象引用，
例如：
    public StringBuffer append(String str)
    public StringBuffer append(StringBuffer sbuf)
    public StringBuffer append(char[] str)
    public StringBuffer append(char[] str, int offset, int len)
    public StringBuffer append(double d)
    public StringBuffer append(Object obj)

---------------------------------

重载方法public StringBuffer insert(...)可以为该StringBuffer 对象
在指定位置插入字符序列，返回修改后的StringBuffer对象引用，
例如：
    public StringBuffer insert(int offset, String str)
    public StringBuffer insert(int offset, double d)

方法 public StringBuffer delete(int start, int end)可以删除从
start开始到end-1为止的一段字符序列，返回修改后的该StringBuffer对象引用。
（比如start = 2， end = 5， 就是 删除 从2 开始 到 4 结束）

--------------------------------------
和String类含义类似的方法：
    public int indexOf(String str)
    public int indexOf(String str, int fromIndex)
    public String substring(int start)
    public String substring(int start, int end)
    public int length()

方法 public StringBuffer reverse()用于将字符序列逆序，返回修改后的
该StringBuffer对象引用。

------------------------------------------

public class TestStringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append("abc");
        sb.append("123");
        System.out.println("sb="+sb); //sb = abc123
        
        sb.insert(3, "--");
        System.out.println("sb="+sb); //sb = abc--123

        sb.delete(2,6); //把下标从2开始到6-1 结束的字符删除
        System.out.println("sb="+sb); //sb = ab23
        
        sb.reverse();
        System.out.println("sb="+sb); //sb = 32ba

        String str = sb.toString();
        System.out.println("str="+str); //str = 32ba
    }
}