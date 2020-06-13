public class Basic {

    /*
    public static void main(String[] args)
    {
        int i = 1002454; 

        System.out.printf("%d\n", i );

        if(3 > 2)
        System.out.printf("Hello"); 
    }
    */

    public static void main(String[] args)
    {
        //System.out.println(123); //println是输出字符串
        
        System.out.println('a' + 1);  //98  ; 'a' 变成数才能 + 1，'a' 变成数是 97
        System.out.println("" + 'a' + 1);  //a1  ;  'a' 先变成了 "a"，然后 1 变成了 "1"
    }
}