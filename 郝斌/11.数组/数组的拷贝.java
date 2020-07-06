/*
public static void arraycopy(
    Object arr1,
    int pos1, 
    Object arr2, 
    int pos2,
    int length
);

将arr1所指向的数组中下标从pos1开始的总共length个元素
覆盖掉arr2所指向的数组中从pos2开始的length个元素。

注意：
    arr1是原数组，arr2是目的数组！
    arraycopy()全是小写，不能大写
*/

class TestArrayCopy
{
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {-1, -2, -3, -4, -5};
        
        System.arraycopy(a, 0, b, 1, 2);
        //a数组没变 1 2 3 4 5
        //b数组变了-1 1 2 -4 -5
        System.out.println("a = ");
        for(int i = 0; i < a.length; ++i)
        {
            System.out.println(a[i]);
        }



    }
}