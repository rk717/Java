//统一一个字符串在另一个字符串中出现的次数

public class TestString_4
{
    public static void main(String[] args)
    {
        String str1 = "abcabcabcabccabc";
        String str2 = "abc";

        int index = -1; 
        int cnt = 0; 
        
        index = str1.indexOf(str2); //str2在str1里第一次出现的位置
        while(-1 != index)
        {
            ++cnt; 
            index = str1.indexOf(str2, index+str2.length());
            //index+str2.length(), 意思是从3开始找，str2， 0 + 3； 因为abc
        }
        System.out.printf("%d\n", cnt);
    }
}