class Student
{
    private String name; 
    private int age; 

    public Student(String name, int age)  //constructor
    {
        //左边是 Class Student 的 name 和 age
        //Class Student 的 name age 前面 加 this
        //右边是 用户 输入的 name age
        this.name = name; 
        this.age = age; 
    }

    public void showInformation()
    {
        System.out.printf("name = %s, age = %d\n", this.name, this.age);
    }
}