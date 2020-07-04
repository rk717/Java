//栈 "吃完就吐"
//模拟程序

int[] data = new int[6];  //数组
int cnt = 0; //cnt表示的时数组有效元素的个数,准备新插入元素的位置

public void push(int val) //生产
{
    data[cnt] = val; 
    ++cnt; 
}

public int pop()  //输出
{
    int Key = data[cnt-1];
    --cnt; 

    return Key; 
}

