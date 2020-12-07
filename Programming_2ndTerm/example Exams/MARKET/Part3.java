package tests;

import market.Fruit;
import market.Market;
import java.io. *;
import java.util. *;
import utest. *;

import java.util.Arrays;

public class Part3 extends Testable {
    private boolean checkFruitLists (LinkedList <Fruit> list1, LinkedList <Fruit> list2) {
        if (list1.size ()! = list2.size ()) return false;
        int i = 0;
        while (i <list1.size () && list1.get (i) .show (). equals (list2.get (i) .show ())) ++ i;
        return (i> = list1.size ());
    }
    public void assertion () {
        try {
            Market m = new Market ("fruits.txt");
            LinkedList <Fruit> expectedFruits = new LinkedList <Fruit> ();
            check ("Market.cheaperThan: the method does not perform the filter well if none of the fruits need to be included in the list.", m.cheaperThan (Fruit.make ("FF", 5)). isEmpty ());
            expectedFruits.add (Fruit.make ("cards", 130));
            expectedFruits.add (Fruit.make ("peach", 55));
            expectedFruits.add (Fruit.make ("plum", 130));
            check ("Market.cheaperThan: the method does not do the filter well.", checkFruitLists (m.cheaperThan (Fruit.make ("FF", 150)), expectedFruits));
            expectedFruits.add (2, Fruit.make ("dinnye", 2015));
            check ("Market.cheaperThan: the method does not do well when all fruits need to be included in the list.", checkFruitLists (m.cheaperThan (Fruit.make ("FF", 3000)), expectedFruits)) ;
            check ("Market.average: doesn't calculate the average well.", m.average () == 582.5);
            Market m2 = new Market ("badfilename.txt");
            check ("Market.average: does not return -1 if there are no fruits.", m2.average () == -1);
        } catch (Exception e) {
            check ("The Market constructor cannot release the exception from the method", false);
        }
    }

    public String description () {return "3. resz"; }
    public String className () {return MarketApi.className; }

    public Object [] expectedMethods () throws Exception {
        return MarketApi.expectedMethods ();
    }

    / *
    public Object [] expectedFields () throws Exception {
        return MarketApi.expectedFields ();
    }
    * /

    public static void main (String ... args) {
        Test.main (new Part3 ());
    }
}