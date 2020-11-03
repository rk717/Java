# Programming languages / Java (BSc, 18) 6th lab

## Instructions

Following the propagation: fixing compile time error

~~~{.java}
import java.io. IOException; 
class TestTime {

    public Time readTime( String fname ) throws IOException {
        ... new java.io.FileReader(fname) ...
    }

    public static void main( String[] args ) throws IOException {
        TestTime tt = new TestTime();
        Time wakeUp = tt.readTime("wakeup.txt");
        wakeUp.aMinutePassed();
    }

}
~~~

Exception handling

~~~{.java}
import java.io. IOException; 
class TestTime {

    public Time readTime( String fname ) throws IOException {
        ... new java.io.FileReader(fname) ...
    }

    public static void main( String[] args ){
        TestTime tt = new TestTime(); 
        try {
            Time wakeUp = tt.readTime("wakeup.txt"); 
            wakeUp.aMinutePassed(); 
        } catch( IOException e ){
            System.err.println("Could not read wake-up time."); 
        }
    }

}
~~~

Exception handling

The program continues running despite the error

~~~{.java}
public class Receptionist {

    ...
    public Time[] readWakeupTimes( String[] fnames ){
        Time[] times = new Time[fnames.length];
        for( int i = 0; i < fnames.length; ++i ){
            try {
                times[i] = readTime(fnames[i]);
            } catch( java.io.IOException e ){
                times[i] = null;   // no-op
                System.err.println("Could not read " + fnames[i]);
            }
        }
        return times; // maybe sort times before returning?
    }

}
~~~

<https://stackoverflow.com/questions/11589302/why-is-throws-exception-necessary-when-calling-a-function>  
<https://stackoverflow.com/questions/2683958/why-is-nullpointerexception-not-declared-as-a-checked-exception>  
<https://stackoverflow.com/questions/297303/printwriter-and-printstream-never-throw-ioexceptions>

### 

### Task 1

#### a

Modify **Task 5** of the **5th lab** so that any `Point` object may be constructed without parameters! In this case, fields `x` and `y` shall be initialised to 0.
Provide setter methods for the `x` and `y` fields of the `Point` class!
Modify the `Circle` class's constructor so that it copies the given `Point` object instead of storing a reference to it!

Circles shall have labels! Extend the `Circle` class with a field capable of storing a label ( `String` )! Adjust the constructor, so that the label may be specified during construction. Make sure to update the `toString()` method's output with the label!
Create a `static final` field for the class called `defaultLabel` with the value `"unnamed"` . When the label provided during construction is `null` the label of the constructed `Circle` object shall be the `defaultLabel` .

Provide the `Circle` class with a constructor that receives two double parameters ( `x` , and `y` ) instead of a `Point` and delegates construction to the constructor we created earlier!

Create a `static` method in the `Circle` class called `readFromFile()` which loads the data of a circle from a file (provided as parameter). The file should contain the coordinates *x* and *y*, the *radius*, and the *label*, all separated by newlines. The method shall construct a `Circle` object using these data and return its reference. Any exception that can arise during these operations should be handled by the caller.

Create a method called `saveToFile()` in the `Circle` class that saves the current `Circle` object to the file (provided as parameter). Exceptions during file operations should not be handled in the method. However, exceptions during write operation must not result in the loss of already written data, therefore make sure the `PrintWriter` object is properly closed!

#### b

Create a modified version of **Task 1 (a)** in which `readFromFile()` tries to handle exceptional situations arising during file operations. If reading the input file fails due to an exceptional event, the method shall return an object filled with zero-like data.

## Instructions

JavaDoc format:

``` 
/**

* ...
* ...

*/
```

How should Java documentation comments written (like block tags, inline tags)?

@param, @return, @throws etc.- block tags

{@code}, {@link} - inline tags

numbers/Rational.java:

~~~{.java}
package numbers; 

public class Rational {

    /**

    -  Set {@code this} to {@code this} * {@code that}.
    -  @param that Non-null reference to a rational number,
    -              it will not be changed in the method.
    -  @throws NullPointerException When {@code that} is null.

    */
    public void multiplyWith( Rational that ){
        this.numerator *= that.numerator;
        this.denominator *= that.denominator;
    }

}
~~~

Generate HTML: `javadoc Rational.java` 

### Task 2

Modify the 3rd task of the 5th lab in the following way:

Organize the logic already written into class methods. The method should also gain beside the command-line parameters a double value.
It should check whether the result of the operation done rounded downwards on the two arguments is equal to this value (return a `boolean` value).
The method should not handle exceptions, this should be done by the caller (in the `main()` ).

Write a javadoc to the method about its functionality!
Use at least the followings:

* `@param` 
* `@returns` 
* `@throws` 

Create documentation for the class as well. It should contaion the `@author` , `@version` and `@since` tags.

Generate HTML documentation for your program with the `javadoc` tool!

## Instructions

~~~{.java}
public enum Day {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY

}
//... 
Day d1 = Daay. MONDAY ; 
Day d2 = Day.valueOf("MONDAY"); 
~~~

`values()` static method - returns every enum value as an array.
`ordinal()` object method - returns the order of the specified value in the enum definition (starts with 0).

<https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html>

### Task 3

Create the `WildAnimal` enum in the `WildAnimal.java` file, it should contain four values:
monkey, elephant, giraffe and racoon.

These animals get two values in their constructors, which fruit do they like and the ideal portion for a day of that fruit.

Create the `listAllAnimals()` method, which returns a string like this:

"_animal ordinal_: _name of the animal_ desires eating _name of the fruit_ a week."

For example, elephants like to eat 30 portions of raspberries a day:

"2: ELEPHANT desires eating 210 raspberries a week."

The `enum` should be iterated using the `values()` , it's ordinal by the `ordinal()` methods.

Create a `toString()` method, which returns the informations stored by the specific `enum` value.

Try and test your enum and the methods in a `Main` class.

## Exercise 1

Create a simple `Color` enum with three values: `RED` , `GREEN` , `BLUE` .

Create a `Car` class, which contains the followings:

* license plate ( `String` )
* color ( `Color` )
* maximal speed ( `int` )

Create a constructor which gets initial values for the fields specified above.
The class should contain a counter, which increases every time a new `Car` is created.

Create a constructor without parameters, which creates a new object with values of `AAA-000` , `BLUE` and `120` .

Create a class method which can compare two cars, it returns true if the first one is faster than the second.

Put the `Color` enum into the `car.utils` package and the `Car` class into the `car` package!

Create an `input.txt` file with cars in it, one car in every line, separated by commas.
Example:
ABC-123, RED, 100
DEF-456, BLUE, 140
GHI-789, GREEN, 50

Create a `Main` class outside of the packages, which will contain the tests.
The `main()` method should read a file and store the cars in an array.

## Exercise 2

Create `JavaDoc` for your code in exercise 1.
Comments should contain information about the method parameters, return values and exceptions.
Generate an HTML documentation!


