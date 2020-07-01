//引用类型数组

public class MyDate 
{
    private int day; 
    private int month; 
    private int year; 
    
    public MyDate(int d, int m, int y)
    {
        day = d; 
        month = m; 
        year = y; 
    }
    public void display()
    {
        System.out.println(day + "-" + month + "-" + year);
    }
}

public class Test
{
    public static void main(String[] args) 
    {
        MyDate[] m; 
        m = new MyDate[10];
        for(int i = 0; i < 10; i++)
        {
            m[i] = new MyDate(i+1, i+1, 1990+i);
            m[i].display();
        }
    }
}

/*
引用类型元素组成的一维数组在使用过程中一般存在着两级的指向关系，
这是理解多维不等长数组的基础。
*/