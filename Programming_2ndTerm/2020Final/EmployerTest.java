
  
package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import exam.findsuitablejob.Position;
import exam.findsuitablejob.EmpAgency;
import exam.findsuitablejob.Employee;
import exam.findsuitablejob.Contract;

public class EmployerTest {
	
	@Test
	public void testContractConstructor1() {
		Contract contract = new Contract();
		assertEquals("Master", contract.getDegree());
		assertEquals(20, contract.getNumberOfEmployees());
		assertEquals(12, contract.getContractPeriod());
	}

	@Test
	public void testContractConstructor2() {
		Contract contract = new Contract("Ph.D", 25, 9);
		assertEquals("Ph.D", contract.getDegree());
		assertEquals(25, contract.getNumberOfEmployees());
		assertEquals(9, contract.getContractPeriod());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testContractConstructorException1() {
		Contract contract = new Contract("Ph.D", 9 , 12);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testContractConstructorException2() {
		Contract contract = new Contract("Ph.D", 3 , 40);
	}
	
	@Test
	public void testPositionSalaries() {
		assertEquals(Position.HOSPITAL.getSalary(), 5000);
		assertEquals(Position.ITCOMPANY.getSalary(), 2700);
		assertEquals(Position.UNIVERSITY.getSalary(), 4000);
		assertEquals(Position.FREELANCER.getSalary(), 7000);
	}

	@Test
	public void testEmployeeGetHired1() {
		Employee emp = Employee.make("Alan Ali,200");

		assertEquals(200, emp.getSalary());

		emp.getHiredAt(Position.FREELANCER);
		assertEquals(7200, emp.getSalary());
		
		emp.getHiredAt(Position.ITCOMPANY);
		assertEquals(9900, emp.getSalary());
	}
	
	@Test
	public void EmployeeMakeReturnNull() {
		assertEquals(null, Employee.make(" sara , 100 , yyy"));
		assertEquals(null, Employee.make(" sara"));
	}
	
	@Test
	public void testEmployeeGetSalaryIncrease() {
		Employee emp = Employee.make("Mazin Jaber,1000");
		assertEquals(3200, emp.getSalaryIncrease(3.2),0.001);
		assertEquals(3000, emp.getSalaryIncrease(3),0.001);
		assertEquals(1800, emp.getSalaryIncrease(1.8),0.001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmployeeGetSalaryIncrease2() {
		Employee emp = Employee.make("Mazin Jaber,1500");
        emp.getSalaryIncrease(0.9);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmployeeGetSalaryIncrease3() {
		Employee emp =  Employee.make("Mazin Jaber,1500");
        emp.getSalaryIncrease(-2.0);
	}
	
	@Test
    public void EmployeeCompareTo1(){
        Employee e1 = Employee.make("Rada reda,3000");
        Employee e2 = Employee.make("Ava reda,2700");
        assertEquals(1, e1.compareTo(e2));
        assertEquals(-1, e2.compareTo(e1));
    }
	
	@Test
    public void EmployeeCompareTo2() {
        Employee b1 = Employee.make("Ava reda,2700");
        Employee b2 = Employee.make("Ava reda,2700");
		Employee b3 = Employee.make("Vano H,2700");
        assertEquals(0, b1.compareTo(b2));
        assertEquals(0, b2.compareTo(b3));
    }
	


	
	@Test
    public void EmployeeEquals() {
        Employee b1 = Employee.make("Ava reda,2700");
        Employee b2 = Employee.make("Ava reda,2700");
		Employee b3 = Employee.make("Vano H,2700");
        assertEquals(true,b1.equals(b2));
        assertEquals(false, b2.equals(b3));
    }
	
	@Test
	public void testEmpAgencyConstructor() {
		EmpAgency empAgency = new EmpAgency("Master", 9 , Employee.make("Avan reda,2700"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Avan reda,2700"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,9000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"));
		assertEquals("Master", empAgency.getDegree());
		assertEquals(15, empAgency.getNumberOfEmployees());
		assertEquals(9, empAgency.getContractPeriod());
	}
	
	@Test
	public void testEmpAgencyMaxIncrease() {
		EmpAgency empAgency = new EmpAgency("Ph.D", 9 , Employee.make("Avan reda,2700"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,9000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Midya A,3000"), Employee.make("Mwwya A,3000"), Employee.make("Mya A,3300"), Employee.make("Midya A,3000"));
		assertEquals(47700, empAgency.getMaxIncrease(5.3),0.001);
	}
	
	@Test
	public void testEmpAgencyLoadMethod() {
		System.out.println (System.getProperty("user.dir"));
		Employee[] emps = EmpAgency.load("tests/emplist.txt");
		Employee[] emps2 = {Employee.make("Ahmed ali,6000"), Employee.make("Aresh ali,5000"), Employee.make("Aron alam,3400"), Employee.make("Anna Reale,6500"),  Employee.make("Ahmed ali,6000"), Employee.make("Aresh ali,5000"), Employee.make("Aron alam,3400"), Employee.make("Anna Reale,6500"),  Employee.make("Ahmed ali,6000"), Employee.make("Aresh ali,5000"), Employee.make("Aron alam,3400"), Employee.make("Anna Reale,6500"),  Employee.make("Ahmed ali,6000"), Employee.make("Aresh ali,5000"), Employee.make("Aron alam,3400"), Employee.make("Anna Reale,6500")};
		assertArrayEquals( emps2 , emps);     
	}	
}


