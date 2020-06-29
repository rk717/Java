class Dian //表示一个点
{
    public int x, y; //attribute 

    public Dian(int x, int y)  //contructor
    {
        this.x = x; 
        this.y = y; 
    }

    public String toString()
    {
        return "[" + x + "," + y + "]"; //[1,2]
    }

}

public class TestPoint
{
    public static void main(String[] args)
    {
        Dian d = new Dian(1, 2);
        //System.out.printf("%s", d);
        System.out.println(d);
    }
}

/*
和 class 相同名字的是 constructor, 之外的 在 class 里 的 都是 method

constuctor 没有 return type
*/

