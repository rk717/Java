package exam.findsuitablejob;

public class Contract {
    //Make all fields of `Contract` class accessible
    // to the descendants of `Contract`, but not to any other class.
    protected String degree;
    protected int numberOfEmployees;
    protected int contractPeriod;
    protected static int goalSalary = 4000;

    // Create getters for all of them, and a setter only for `goalSalary`.
    public String getDegree() {
        return degree;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public int getContractPeriod() {
        return contractPeriod;
    }
    public static void setGoalSalary(int goalSalary) {
        Contract.goalSalary = goalSalary;
    }

    //`contractPeriod` is at least 6 and not more than 12 months,
    // (for this create two constants( outside the constructor)
    // that hold values 6 and 12 of type 'int'.
    protected final int cpStart = 6;
    protected final int cpEnd = 12;

    //1st constructor
    public Contract(String degree, int numberOfEmployees, int contractPeriod) {
        if(contractPeriod >= cpStart && contractPeriod <= cpEnd){
            this.contractPeriod = contractPeriod;
        }else{
            throw new IllegalArgumentException();
        }
        if(numberOfEmployees >= 15 && numberOfEmployees <= 40){
            this.numberOfEmployees = numberOfEmployees;
        }else{
            throw new IllegalArgumentException();
        }
        this.degree = degree;
    }

    //To make it easier to check those conditions,
    // create a static method `isBetween(number, min, max)`
    // that returns whether `number` is between `min` and `max`.
    public static boolean isBetween(int number, int min, int max){
        if(number >= min && number <= max){
            return true;
        }else{
            return false;
        }
    }

    // 2nd constructor
    public Contract() {
        this.degree = "Master";
        this.numberOfEmployees = 20;
        this.contractPeriod = 12;
    }

    //Override `toString()` method and give it a suitable implementation.
    @Override
    public String toString() {
        return "New Contract information is: " +
                " degree= " + degree +
                ", numberOfEmployees= " + numberOfEmployees +
                ", contractPeriod= " + contractPeriod +
                ". The End :) ";
    }
}



