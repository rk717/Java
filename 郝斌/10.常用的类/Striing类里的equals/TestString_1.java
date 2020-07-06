//测试string类的equals方法的使用
// == 的用法
// 常量字符串的用法
public class TestString_1
{
    public static void main(String[] args)
    {
        String str1 = new String("china");
        Strung str2 = new String("china");
        System.out.println(str1.equals(str2)); //true 
        //str1.equals(str2)是用来判断str1指向的对象内容和str2指向的对象的内容是否相等

        if(str1 == str2) //str1 == str2 是判断str1和str2自身的内容是否相等
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");
        //str1 != str2

        String str3 = "china";
        String str4 = "china";
        if (str3 == str4)
            System.out.println("str3 == str4");
        else 
            System.out.println("str3 != str4");

    }
}

/*
    String str1 = new String("china");
    Strung str2 = new String("china");
    这两个都是在堆区（heap）有自己独立的空间。

    String str3 = "china";
    String str4 = "china";
    这两个的“china”在数据区（data），共同指向相同的china

    str1 str2 str3 str4 都在栈区


*/