class Triangle {
    int a, b, c; //用三个字母，表示三角形的三边

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

        t.a = 3;
        t.b = 4; 
        t.c = 5; 

        System.out.printf("Perimeter: %d\nArea:%f\n", t.perimeter(), t.area());
;    }
}