/*
字符类型
    单个的字符是一种特殊的类型：char
        用单引号表示的字符字面量： 'a', '1'

        java使用Unicode来表示字符，可以表达包括汉字在内的多种文字
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = 'a';
        System.out.println(c);
    }
}

/*
逃逸字符
    \b 回退一格
    \t 到下一个表格位
    \n 换行
    \r 回车
    \" 双引号
    \' 单引号
    \\ 反斜杠本身
*/