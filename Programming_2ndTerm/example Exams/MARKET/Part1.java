package tests;

import market.Fruit;
import utest. *;

import java.util.Arrays;

public class Part1 extends Testable {
    public void assertion () {
        check ("Fruit.getCheapestFruit: the method must return null if no Fruit object was created.", Fruit.getCheapestFruit () == null);
        Fruit f1 = Fruit.make ("A", 15);
        check ("Fruit.make: also creates the object for the name tul rovid.", f1 == null);
        f1 = Fruit.make ("ABC", -5);
        check ("Fruit.make: also creates the object with a negative array.", f1 == null);
        f1 = Fruit.make ("ABC", 0);
        check ("Fruit.make: also creates the object with null.", f1 == null);
        f1 = Fruit.make ("ABC", 5005);
        check ("Fruit.make: creates the object with too large an arl.", f1 == null);
        f1 = Fruit.make ("ABC", 16);
        check ("Fruit.make: also creates the object with a value other than 0 or 5.", f1 == null);
        f1 = Fruit.make ("AB C", 200);
        check ("Fruit.make: also creates the object with a name that contains an illegal character.", f1 == null);
        f1 = Fruit.make ("alma", 700);
        check ("Fruit.make: does not create the object with the correct parameters.", f1! = null);
        check ("Fruit.getPrice: the method does not return correct data.", f1.getPrice () == 700);
        Fruit f2 = Fruit.make ("cards", 600);
        check ("Fruit.cheaperThan: the method does not return correct data.",! f1.cheaperThan (f2));
        check ("Fruit.cheaperThan: the method does not return correct data.", f2.cheaperThan (f1));
        check ("Fruit.show: the method does not return correct data with an arsenal less than 1000.", f1.show (). equals ("apple (700 Ft)"));
        Fruit f3 = Fruit.make ("peach", 1125);
        check ("Fruit.show: the method does not return correct data with an arsenal greater than 1000.", f3.show (). equals ("peach");
        Fruit f4 = Fruit.make ("gorogdinnye", 1025);
        check ("Fruit.show: the method does not return correct data if it is a 0 jon after the thousand divisions", f4.show (). equals ("watermelon (1 025 Ft)"));
        Fruit f5 = Fruit.make ("strawberry", 1005);
        check ("Fruit.show: the method does not return the correct data, if after two divisions two 0 jon.", f5.show (). equals ("strawberry (1 005 Ft)"));
        Fruit f6 = Fruit.make ("sargadinnye", 1000);
        check ("Fruit.show: the method does not return correct data if ar is divisible by 1000.", f6.show (). equals ("melon (1,000 Ft)"));
        check ("Fruit.getCheapestFruit: the method does not return the cheapest Fruit object ever created.", Fruit.getCheapestFruit (). show (). equals (f2.show ()));
        Fruit f7 = Fruit.make ("plum", 600);
        check ("Fruit.cheaperThan: the method does not return correct data with the same fruit.",! f7.cheaperThan (f2));
        check ("Fruit.cheaperThan: the method does not return correct data with the same fruit.",! f2.cheaperThan (f7));
        check ("Fruit.cheaperThan: the method does not return correct data with the same fruit.",! f2.cheaperThan (f7));
        check ("Fruit.getCheapestFruit: if it is the same as the cheapest fruit ever created, the method must return the earliest one created.", Fruit.getCheapestFruit (). show (). equals (f2.show ())) ;
    }

    public String description () {return "1st res"; }
    public String className () {return FruitApi.className; }

    public Object [] expectedMethods () throws Exception {
        return FruitApi.expectedMethods ();
    }

    / *
    public Object [] expectedFields () throws Exception {
        return FruitApi.expectedFields ();
    }
    * /

    public static void main (String ... args) {
        Test.main (new Part1 ());
    }
}