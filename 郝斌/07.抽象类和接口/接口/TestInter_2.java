class A
{

}

interface It1
{

}

interface It2
{

}

interface It3 extends It1, It2 //接口可以继承多个接口
{

}

interface It4
{
    int i = 20; 
}

//一个类可以继承一个父类的同时实现一个或多个接口，但extends关键字必须在implents之前
class T extends A implements It4, It3
{

}

public class TestInter_2 
{
    public static void main(String[] args)
    {
        System.out.println("Haha");
    }
}