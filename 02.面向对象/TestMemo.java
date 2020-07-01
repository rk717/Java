package 面向对象;
class A  //这里是设计图纸，简称类，模型
{
    int i; 
    int j;
}

class TestMemo 
{
    public static void main(String[] args)
    {
        A aa = new A(); //(A*)malloc(sizeof(A))
        //new A(): 在堆中动态分配一块区域，被当作了A对象
        //aa 本身的内存是在栈中分配的
        //堆中内存的地址赋给了aa
        //aa指向了堆中的内存，aa代表了堆中的内存

        //aa.i 代表：aa这个静态指针变量所指向的动态内存中的A对象的i这个成员
        //aa.j 代表：aa这个静态指针变量所指向的动态内存中的A对象的j这个成员

        aa.i = 10;   //aa永远只占4个字节，只保存第一个变量的地址
        aa.j = 20; 

        System.out.printf("%d %d\n", aa.i, aa.j);

        /*
            内存本质就是一个线性区域
            我们只是模拟了一块区域“堆”， 又模拟了一块区域给“栈”
            栈：A aa (aa指向了堆中的内存)
            堆：new A()
        */

        //int i = 10; 
    }

    /*
        heap : new出来的动态内存，堆里面的东西
        stack： 栈， 局部变量
        
        data segment: 静态变量，和字符串常量 例如：字符串"abc"

        code segment: 代码区 "一系列的计算操作，比如for循环和加减乘除"

    */

    //在栈区的东西 不 需要释放
    //在堆区的东西 需要 手动释放

    
}