public class TestThis_1 {
    static class A
    {
        public int i;

        public A(int j)
        {
            i = j; 
        }

        public void show() //A* this//this代表的是当前正在调用show方法的对象
        {
            System.out.printf("i = %d\n", i); //(*this).i
        }
    }

    public static void main(String[] args)
    {
        A aa1 = new A(10);
        A aa2 = new A(20);
        
        aa1.show(); //aa1.show(aa1);
        aa2.show(); //aa2.show(aa2);

    }
}

/*
aa1 和 aa2 在内存中分别有各自的数据成员 i，
但是 aa1 和 aa2 公用 show（）方法，
show方法如何知道输出的i应该是哪个对象中的i？ 因为 this.i

this 指向当前正在调用该方法的对象
*/