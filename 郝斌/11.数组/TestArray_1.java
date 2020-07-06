



public class TestArray_1 
{
    public static void main(String[] args) 
    {
        //方法1
        // int[] arr1;   //声明一个数组名
        // arr1 = new int[3];    //数组长度是3
        // arr1[0] = 0; 
        // arr1[1] = -1; 
        // arr1[2] = 2; 
        // showArr(arr1);
        // System.out.println("**********");

        //方法2
        int[] arr2 = new int[] {0, 1, 2};
        showArr(arr2);
        System.out.println("**********");

        System.out.println(arr1);//error, 一维数组的内容是不能通过System.out.println()直接输出的，即使该数组的内容是引用且已经重写。

        // int[3] arr3 = new int[]{0,1,2}; //error 因为 int[]
        // int[] arr4 = new int[3]{0,1,2}; //error 因为int[]
        // int[3]arr5 = new int[3]{0,1,2}; //error 因为int[]
        //数组赋值时，前面后面都是 int[], 里面不填任何数字


        //方法3
        int[] arr6 = {0, 1, 2};
        showArr(arr6);
        System.out.println("******");
        arr6 = new int[] {5,4,3,2,1};
        showArr(arr6);
    }

    public static void showArr(int[] arr)
    {
        for(int i = 0; i < arr.length; ++i)
            System.out.println(arr[i]);
    }
}