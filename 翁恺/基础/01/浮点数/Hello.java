import java.util.Scanner; 

public class Hello{
    public static void main(String[] args) {
        double foot; 
        double inch; 

        //构造一个Scanner把 foot 和 inch 读进来。
        Scanner in = new Scanner(System.in);

        foot = in.nextDouble();
        inch = in.nextDouble();

        System.out.prinln((foot+inch/12.0)*0.3048);

    }
}