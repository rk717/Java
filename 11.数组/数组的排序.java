/*
sort方法可以实现对数组的排序

int[] a {6,23, 45, 12, -83, 94, 41}; //创建样本数组

Arrays.sort(a); //数组排序

//排序后将数组元素输出
for(int i = 0; i < a.length; i++)
{
    System.out.print(arr[i] + "\t");
}

*/

import java.util.*;

public class TestArraySort_1
{
    public static void main(String[] args) 
    {
        int[] data = {1,3,5,7,2,4,6,8,10,9};
        System.out.println("排序前数组data中的内容是： ");
        showArray(data);
        
        Arrays.sort(data);

        System.out.println("排序后数组data中的内容是： "); 
        showArray(data);
    }

    public static void showArray(int[] data)
    {
        for(int e: data ) //把data数组中的每个元素取出来， 赋值给e
            System.out.printf("%d\t", e);
        System.out.println("");
    }

}