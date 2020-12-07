package tests;

import market.Fruit;
import market.Market;
import java.io. *;
import utest. *;

import java.util.Arrays;

public class Part2 extends Testable {
    public void assertion () {
        try {
            Market m1 = new Market ("badfilename.txt");
            check ("Market constructor: initialized the market with an empty list in case of an incorrect filename.", m1.numberOfFruits () == 0);
            Market m2 = new Market ("fruits.txt");
            check ("Market constructor: read the wrong amount of data.", m2.numberOfFruits () == 4);
            check ("Market.show: displays the object incorrectly if there are no fruits.", m1.show (). equals (""));
            check ("Market: either the constructor rogzit erroneous data or the show method displays them incorrectly.", m2.show (). equals \ nplums (130 HUF) "));
        } catch (Exception e) {
            check ("The Market constructor cannot release the exception from the method", false);
        }
    }

    public String description () {return "2nd res"; }
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
        Test.main (new Part2 ());
    }
}