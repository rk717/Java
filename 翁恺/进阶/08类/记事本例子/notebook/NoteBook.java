package notebook;

import java.util.ArrayList;

public class NoteBook 
{

    //容器
    private ArrayList<String> notes = new ArrayList<String>(); //用来存放string的arrayList
 
    /*
        容器类

        ArrayList<String>notes = new ArrayList<String>;

        容器类有两个类型：
            容器类的类型
            元素的类型
    */

    public void add(String s) //添加记录
    {
        notes.add(s);
    }

    public void add(String s, int location)
    {
        notes.add(location, s);
    }

    public int getSize() //查看已经存储的数量
    {
        return notes.size();
    }

    public String getNote(int index) //查看一条记录
    {
        return notes.get(index);
    }

    public void removeNote(int index) //删除一条记录
    {
        notes.remove(index); 
    }

    public String[] list() //列出所有记录
    {
        String[] a = new String[notes.size()];
        // for(int i = 0; i < notes.size(); i++)
        // {
        //     a[i] = notes.get(i);
        // }
        notes.toArray(a);
        
        return a; 
    }

    public static void main(String[] args) 
    {
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        System.out.println(nb.getSize());
    }
}