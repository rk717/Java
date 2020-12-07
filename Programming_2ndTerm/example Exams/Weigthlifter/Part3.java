package tests;

import weightlifting.WeightLifter;
import weightlifting.Championship;
import java.io. *;
import java.util. *;
import utest. *;

import java.util.Arrays;

public class Part3 extends Testable {
    private boolean checkWeightLifterLists (LinkedList <WeightLifter> list1, LinkedList <WeightLifter> list2) {
        if (list1.size ()! = list2.size ()) return false;
        int i = 0;
        while (i <list1.size () && list1.get (i) .show (). equals (list2.get (i) .show ())) ++ i;
        return (i> = list1.size ());
    }
    public void assertion () throws Exception {
        Championship cs = new Championship ("weightlifters.txt");
        LinkedList <WeightLifter> expectedWeightLifters = new LinkedList <WeightLifter> ();
        check ("Championship.strongerThan: the method will not do well if none of the competitors need to be included in the list.", cs.strongerThan (WeightLifter.make ("W L", 300)). isEmpty ());
        expectedWeightLifters.add (WeightLifter.make ("Ivan Ivanov", 120));
        expectedWeightLifters.add (WeightLifter.make ("Foldi Imre", 137));
        expectedWeightLifters.add (WeightLifter.make ("Koji Miki", 137));
        check ("Championship.strongerThan: the method does not do the filter well.", checkWeightLifterLists (cs.strongerThan (WeightLifter.make ("W L", 100)), expectedWeightLifters));
        expectedWeightLifters.add (2, WeightLifter.make ("Pablo Lara", 25));
        expectedWeightLifters.add (3, WeightLifter.make ("Aleksey Petrov", 9));
        check ("Championship.strongerThan: the method doesn't do well if all competitors have to be added to the list.", checkWeightLifterLists (cs.strongerThan (WeightLifter.make ("WL", 1)), expectedWeightLifters)) ;
        check ("Championship.average: does not calculate the average well.", cs.average () == 85.6);
        Championship cs2 = new Championship ("badfilename.txt");
        check ("Championship.average: no returns -1 if there are no weights.", cs2.average () == -1);
    }

    public String description () {return "3. resz"; }
    public String className () {return "weightlifting.Championship"; }

    public Object [] expectedMethods () throws Exception {
        return new Object []
            {constructor (className (), new Class [] {String.class})
            , optionalMethod (className () + ".numberOfWeightLifters")
            , optionalMethod (className () + ".show")
            , method (className () + ".strongerThan", weightlifting.WeightLifter.class)
            , method (className () + ".average")
            , optionalMethod (className () + ".round")
            , optionalMethod (className () + ".championship")
            };
    }

    public static void main (String ... args) {
        Test.main (new Part3 ());
    }
}