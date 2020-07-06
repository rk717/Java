//统计一个string对象中大写字母，小写字母，非字母，各自出现的次数

public class TestString_3
{
    public static void main(String[] args)
    {
        String str = "abAMl, !23";

        int cntU = 0; //大写字母的个数
        int cntL = 0; //小写字母的个数
        int cntOther = 0; 
        int i; 

        //方法3
        // String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String s2 = "abcdefghijklmnopqrstuvwxyz";
        // for(i=0; i<str.length(); ++i)
        // {
        //     char ch = str.charAt(i);
        //     if(-1 != (s1.indexOf(ch)))
        //         cntU++; 
        //     else if(-1 != s2.indexOf(ch))
        //         cntL++; 
        //     else
        //         cntOther++;
            
        // }

        //方法2
        // for(i = 0; i < str.length(); ++i)
        // {
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch))
        //         cntU++; 
        //     else if(Character.isLowerCase(ch))
        //         cntL++;
        //     else
        //         cntOther++;
        // }


        //方法一
        // for(i = 0; i < str.length(); ++i)
        // {
        //     char ch = str.charAt(i); 
        //     if(ch >= 'a' && ch <= 'x')
        //         cntL++;
        //     else if(ch >= 'A' && ch <= 'Z')
        //         cntU++;
        //     else
        //         cntOther++; 

            
        // }
        System.out.printf("大写字母的个数；%d\n", cntU);
        System.out.printf("小写字母的个数；%d\n", cntL);
        System.out.printf("非字母的个数；%d\n", cntOther);

        // 大写字母的个数；2
        // 小写字母的个数；3
        // 非字母的个数；5
    }
}