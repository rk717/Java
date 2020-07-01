//函数的重载

class TestOver
{
    /*
    函数的重载：
        同名的函数通过不同的形参做类似的事情，这就叫函数的重载

        可以定义两个名字一样的函数，但是形参不同

        如果两个函数只是函数的返回值不一样，其他都一眼，这构不成函数的重载，编译时会报错。
    */
    static int add(int a, int b)
    {
        return a+b; 
    }

    static int add(int a, int b, int c)
    {
        return a + b + c; 
    }

    static double add(double x, double y)
    {
        return x + y; 
    }

    public static void main(String[] args)
    {
        System.out.printf("%f\n", add(1.5, 2.2));
        System.out.printf("%d\n", add(1, 2, 3));

        System.out.printf("Hi");
    }
}