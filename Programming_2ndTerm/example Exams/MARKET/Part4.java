package tests;

import market.Fruit;
import market.Market;
import java.io. *;
import java.util. *;
import utest. *;

import java.util.Arrays;

public class Part4 extends Testable {
    private boolean checkFruitLists (LinkedList <Fruit> list1, LinkedList <Fruit> list2) {
        if (list1.size ()! = list2.size ()) return false;
        int i = 0;
        while (i <list1.size () && list1.get (i) .show (). equals (list2.get (i) .show ())) ++ i;
        return (i> = list1.size ());
    }
    public void assertion () {
        try {
            Market m = new Market ("fruits.txt");
            check ("Market.buyCheapestFruit: the method does not return the correct fruit.", m.buyCheapestFruit (). show (). equals ("peach (55 Ft)"));
            check ("Market.buyCheapestFruit: the method does not dock the list.", m.numberOfFruits () == 3);
            check ("Market.buyCheapestFruit: the method does not leave good fruits in the list.", m.show (). equals ("pear (130 Ft) \ watermelon (2 015 Ft) \ nplums (130 Ft)");
            check ("Market.buyCheapestFruit: the method does not return the correct fruit if it has the same value as the cheapest.", m.buyCheapestFruit (). show (). equals ("korte (130 Ft)"));
            check ("Market.buyCheapestFruit: the method removes the appropriate fruit if it has the same value as the cheapest.", m.show (). equals ("melon (2,015 Ft) \ nplums (130 Ft)"));
            m.buyCheapestFruit ();
            check ("Market.buyCheapestFruit: the method does not return the correct fruit if there was only one fruit left.", m.buyCheapestFruit (). show (). equals ("melon (Ft 2,015)"));
            check ("Market.buyCheapestFruit: the method does not clear the list if the fruits are out.", m.show (). equals (""));
            check ("Market.buyCheapestFruit: the method does not work well if there are no fruits.", m.buyCheapestFruit () == null);
            check ("Market.buyCheapestFruit: the method does not work well if there are no fruits.", m.show (). equals (""));
            m = new Market ("fruits.txt");
            LinkedList <Fruit> expectedFruits = new LinkedList <Fruit> ();
            expectedFruits.add (Fruit.make ("peach", 55));
            expectedFruits.add (Fruit.make ("cards", 130));
            expectedFruits.add (Fruit.make ("plum", 130));
            expectedFruits.add (Fruit.make ("dinnye", 2015));
            check ("Market.sale: the method returns an incorrect list.", checkFruitLists (m.sale (), expectedFruits));
            check ("Market.sale: the method was not checked out of the list.", m.numberOfFruits () == 0);
            check ("Market.sale: the method does not work well if there are no fruits.", m.sale (). isEmpty ());
        } catch (Exception e) {
            check ("The Market constructor cannot release the exception from the method", false);
        }
    }

    public String description () {return "4. resz"; }
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
        Test.main (new Part4 ());
    }
}