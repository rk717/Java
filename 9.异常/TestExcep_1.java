class A
{
    int divide(int a, int b)
    {
        int m; 
        m = a / b; 
        return m; 
    }
}

public class TestExcep_1
{
    public static void main(String[] args)
    {
        A aa = new A();
        
        try
        {
            aa.divide(6, 2);
        }
        catch(ArithmeticException e) //e用来接收23行抛出的异常对象
        {
            e.printStackTrace(); //可以简单理解为，输出该异常的具体信息
            System.out.printf("除零错误\n");
        }

        System.out.printf("Hello");
    }
}


/*
1.Error是系统错误，程序员无法处理这些异常
2.Exception是程序员可以捕获并处理的异常
3.RuntimeException的子类异常，是你可以处理也可以不处理的异常。
4.凡是继承自Exception但又不是RuntimeException子类的异常，我没都必须的捕捉并进行处理。
*/

