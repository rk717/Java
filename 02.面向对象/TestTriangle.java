package 面向对象;

class Triangle { //属性
    
    private int a, b, c; //用三个字母，表示三角形的三边
    //变成私有的了，不能在外部访问


    int perimeter() //不需要形参，因为事物内部，方法和属性可以相互访问
    {
        return a + b + c; 
    }

    double area()
    {
        double p = 1.0 * (a + b + c) / 2; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

//上面的class只是一个模型
//下面的这个是定义事物

class TestTriangle
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle();

        // t.a = 3;
        // t.b = 4; 
        // t.c = 5; 

        System.out.printf("Perimeter: %d\nArea:%f\n", t.perimeter(), t.area());
    }
}

/*
类的访问控制符
Public：公有的，任何对象都可以访问
Protect: 保护型的，稍微有些限制
Private: 私有的，不能在外面机型访问
Default： 默认的，不加访问控制符

一个类的内部，如何辨别和访问？
*/