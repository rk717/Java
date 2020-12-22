package exam.findsuitablejob;

import java.util.Objects;

public class Employee implements Employable, Comparable<Employee> {
    protected String employeeName;
    protected int salary = 0;

    private Employee(String employeeName, int salary) {
        if(employeeName != null && !employeeName.isEmpty()){
            this.employeeName = employeeName;
        }else{
            throw new IllegalArgumentException();
        }
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    //Write a static method `make` of type `Employee`
    // which takes `data` of type `String` as argument.
    public static Employee make(String data){
        //data: 'name,salary', I separate this data from ',' then
        //change String salary, to int salary.
        String[] arrOfStr = data.split(",", 2);
        int salaryTest = Integer.parseInt(arrOfStr[1]);
        if(data == null && data.isEmpty() && salaryTest < 0){
            return null;
        }else{
            try{
                int salary = Integer.parseInt(arrOfStr[1]);
            }catch (NumberFormatException e){
                System.out.println("Exception thrown: " + e);
            }
        }

        //return an Employee initialized with the name
        // and salary you just extracted from the `data`.
        Employee p1 = new Employee(arrOfStr[0], salaryTest);
        return p1;
    }

    //Override `equals()` which return equality of 'Employee's object
    // depending on 'name' and 'salary'.
    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }else if (object == null) {
            return false;
        }
        Employee employee = (Employee) object;
        return salary == employee.salary &&
                Objects.equals(employeeName, employee.employeeName);
    }

    //Override `hashcode()` and 'toString()' methods
    @Override
    public int hashCode() {
        return Objects.hash(employeeName, salary);
    }

    @Override
    public String toString() {
        return "The Employee information: " +
                "employeeName: " + employeeName + '\'' +
                ", salary: " + salary;
    }

    @Override
    public void getHiredAt(Position pos) {
        //increase the 'salary' by the enum value.
    }

    @Override
    public int getSalaryIncrease(double increaseRate) {
        if(increaseRate < 1.1){
            throw new IllegalArgumentException();
        }
        salary *= increaseRate;
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        //make the comparision according to the `salary` value.
        if(this.salary < employee.salary){
            System.out.println("The first man salary is higher. ");
        }else{
            System.out.println("The second man salary is higher. ");
        }
        return 0;
    }
}
