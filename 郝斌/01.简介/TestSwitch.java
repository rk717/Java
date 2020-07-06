public class TestSwitch 
{
    public static void main(String[] args)
    {
        switch (1)
        {
            case 0:
                System.out.printf("0000\n");
            case 1:
                System.out.printf("1111\n");
            case 2:
                System.out.printf("2222\n");
        }
    }
}

//1111
//2222

//从case1向下全部执行