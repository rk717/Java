public class TestStudent {
    static class Human
    {
        private String name; 
        private int age; 

        public Human()
        {

        }

        public Human(String name, int age)
        {
            this.name = name; 
            this.age = age; 
        }

        public void setName(String name)
        {
            this.name = name; 
        }

        public void setAge(int age)
        {
            this.age = age; 
        }

        public String getInfo()
        {
            String strInf = name + ": " + age;
            return strInf;  
        }
    }
    
    static class Student extends Human
    {
        public String school; 

        public Student()
        {
            
        }

        public Student(String name, int age, String school)
        {
            super(name, age);
            // this.name = name; //error因为name是私有的
            // this.age = age; //error因为age是私有的
            this.school = school;  
        }

        public void setSchool(String school)
        {
            this.school = school; 
        }

        public String getInfo()
        {
            //String strInf = name + ": " + age ": " + school;  error:因为name和age均为私有的
            String strInf = super.getInfo() + ": " + school; //调用父类的getInfo,从而获得name和age
            return strInf; 
        }
    }

    public static void main(String[] args)
    {
        Student st1 = new Student("James", 22, "TUM");
        System.out.printf("%s\n", st1.getInfo());
    }



}