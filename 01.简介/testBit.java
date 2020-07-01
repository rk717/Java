public class testBit {

    public static void main(String[] args)
    {
        int i = -3; 
        int j = 11; 
        int k = i & j; 
        /*
        位运算符：
            3：0000 0011 取反 1111 1100 加1： 1111 1101 
            即-3的二进制代码为 1111 1101 
            11： 0000 1011 
            所以 -3 和 11 的二进制不一样
            所以： 
                1111 1101
                0000 1011
                ----------
                0000 1001 = 9
        */

        System.out.printf("%d\n", k); 
    }
    
}