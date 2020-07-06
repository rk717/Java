class DivisorIsZeroException extends Exception
{
    public DivisorIsZeroException(String errorMessage)
    {
        super(errorMessage);
    }
}

class A
{
    int divide(int a, int b)
    {
        try
        {
            if(0 == b)
            {
                throw new DivisorIsZeroException("The divisor can't be zeor.\n");    
            }
        }
        catch(DivisorIsZeroException e)
        {
            e.printStackTrace(); //既输出了错误的信息，也说出了错误的路径
        }
        
        int m = a / b;
        return m;
    }
}

public class TestA 
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.divide(6,2); 
    }
}