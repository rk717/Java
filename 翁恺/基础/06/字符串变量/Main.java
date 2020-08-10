/* 
new = 创建

String s = new String("a string");
创建了一个String的对象

用'a string'初始化这个对象

创建管理这个对象的变量 s

让 s 管理这个 对象

=========================

初始化字符串变量
    String s = "hello";
    编译器帮你创建一个String类的对象交给s来管理

==========================
输入字符串
    in.next();读入一个单词，单词的标志是空格。
    空格包括空格、tab和换行

    in.nextLine(); 读入一整行
*/

import java.util.Scanner; 

public class Main 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s; 
        s = in.nextLine();
        System.out.println(s);
    }
}