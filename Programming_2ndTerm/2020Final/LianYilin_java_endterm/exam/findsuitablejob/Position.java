package exam.findsuitablejob;

public enum Position {
    //includes the four positions:

    FREELANCER(7000),
    UNIVERSITY(4000),
    HOSPITAL(5000),
    ITCOMPANY(2700);

    protected int salary = 0;

    //Create getter for `salary`
    public int getSalary() {
        return salary;
    }

    //Set a constructor for `Position` enum that takes `salary` as argument and set its value.
    Position(int salary) {
        this.salary = salary;
    }

}
