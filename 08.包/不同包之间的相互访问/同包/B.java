class B
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.f(); //AAAA
    }
}

/*
因为类A和类B默认是在同一个无名的包中，
所以彼此可以相护访问，
只要是非私有成员都可以被同包的另一个类访问
*/