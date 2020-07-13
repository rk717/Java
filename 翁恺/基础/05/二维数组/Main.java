/*
二维数组
    int[][] a = new int[3][5];

二维数组遍历
    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 5; j++)
        {
            a[i][j] = i*j; 
        }
    }

a[i][j]是一个int
表示第i行，第j列上的单元。
*/

//井字棋

import java.util.Scanner; 

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3; 
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false; 
        int numOfX = 0; 
        int numOfO = 0; 

        //读入矩阵
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                board[i][j] = in.nextInt();
            }
        }

        //检查结果

        
    }
}