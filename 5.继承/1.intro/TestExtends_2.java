class Human
{
    public String name = "James"; 
    public int age = 22; 
}

class Student extends Human //学生继承了人
{
    public double score = 66.6; 
}

class Graduate extends Student // 研究生继承了学生
{
    public String daoshi = "Szumi"; 
}

public class TestExtends_2
{
    public static void main(String[] args)
    {
        Graduate gd = new Graduate();
        System.out.printf("%s %f\n", gd.name, gd.score);
    }
}

