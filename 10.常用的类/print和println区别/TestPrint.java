class Dian
{
    public int x, y; 

    public Dian(int x, int y)
    {
        this.x = x; 
        this.y = y; 
    }

    public String toString()
    {
        return "[" + x + ", " + y + "]"; 
    }
}

public class TestPrint 
{
    public static void main(String[] args) 
    {
        Dian d = new Dian(3, 2);

        System.out.printf("%s\n", d);  //[3, 2]
        
        System.out.println(d);  //[3, 2]

        int i, j, k; 
        i = 1; 
        j = 2; 
        k = 3; 
        System.out.printf("%d + %d + %d = %d\n", i, j, k, i+j+k); //1 + 2 + 3 = 6
        System.out.println(i + "+" + j + "+" + k + "=" + (i+j+k)); //1+2+3=6

        int m = 47; 
        System.out.println(m); //1234
        System.out.printf("%d\n", m); //1234

        System.out.printf("十进制数字%d用十六进制表示是: %#X\n", m, m);
        System.out.printf("十进制数字" + m + "用十六进制表示是:0X" + Integer.toHexString(m).toUpperCase());
 
        System.our.printf("%b\n", "abc".equals("zhansan")); //false
        System.out.printf("%d\n", "abc".length()); //3
        System.out.printf("%d\n", "abccadssad".indexOf("ads")); //4
    }    
}