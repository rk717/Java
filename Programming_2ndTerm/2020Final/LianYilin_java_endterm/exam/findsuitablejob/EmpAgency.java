package exam.findsuitablejob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpAgency extends Contract{
    List<Employee> employees = new ArrayList<Employee>();

    public EmpAgency(String degree, int numberOfEmployees, int contractPeriod) {
        super(degree, numberOfEmployees, contractPeriod);
        this.employees = employees;
    }

    //Create method `load()` which takes `filePath` of type `String`
    // and return an Array of 'Employee' objects.
    public static Employee load(){

    }

    //Create method `hire()` that takes a 'Position' as argument
    // and it go through 'employees' list (using Iterator).
    public void hire(Position position){
        //Then the list of hired employees is sorted in
        // ascending order depending on 'salary' value.
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if(){

            }
        }
    }

    //Override `toString()` in `EmpAgency` which prints employees.
    @Override
    public String toString() {
        return "EmpAgency info: " +
                "employees=" + employees;
    }
}
