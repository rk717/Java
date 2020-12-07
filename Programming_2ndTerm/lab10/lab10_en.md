# Programming languages (BSc, 18) Java 10. seminar



## Liskov Substitution Principle

~~~{.java}
public static boolean isSameAuthor(Book book1, Book book2)
{
    return book1.getAuthor().equals(book2.getAuthor());
}

public static void main(String[] args)
{
    Book book1 = new Book();
    Book book2 = new Book("author", "Title", 100);

    PrintedBook pbook2 = new PrintedBook("author", "Printed: Title", 100, CoverType.Softcover);

    System.out.println(isSameAuthor(book1, book2));
    System.out.println(isSameAuthor(book2, pbook2));
}
~~~

Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it. (Stackoverflow)

## static vs. dynamic type of a variable

~~~{.java}
Book book;

book = new Book();
// the static type of book is Book, the dynamic type of book is Book
System.out.println(book.toString()); // Book toString()

book = new PrintedBook("author", "Printed: Title", 100, CoverType.Softcover);
// the static type of book is Book, the dynamic type of book is PrintedBook
System.out.println(book.toString()); // PrintedBook toString()

//PrintedBook pbook3 = (PrintedBook)book1;
//System.out.println(pbook3.toString());
~~~

## equals() és hashCode()

~~~{.java}
class Vector
{
    double[] coords;

    public Vector(double x1, double x2)
    {
        this.coords = new double[2];
        this.coords[0] = x1;
        this.coords[1] = x2;
    }

    public String toString()
    {
        return "(" + this.coords[0] + "," + this.coords[1] + ")";
    }
}
~~~

~~~{.java}
class Main
{
    public static void main(String[] args)
    {
        System.out.println(new Vector(2, 3).equals(new Vector(2, 3)));
        System.out.println(new Vector(2, 3).equals(new Vector(2, 2)));

        HashSet<Vector> exampleSet = new HashSet<Vector>();
        exampleSet.add(new Vector(0, 0));
        exampleSet.add(new Vector(3, -7));
        exampleSet.add(new Vector(3, -7));
        System.out.println( "size of HashSet: " + exampleSet.size());
        System.out.println( "items of HashSet: " + exampleSet);
    }
}
~~~

Our expectations of the `equals()` and `hashCode()` methods:

- `equals()` is an equivalence relation (reflexive, symmetric, transitive)
- if `a != null`, then `a.equals(null)` is false
    - however `null.equals(a)` should throw a `NullPointerException`
- `equals()` should be consistent with `hashcode()`
    - equal objects should have equal hashcodes
      (meaning if `a.equals(b)` then `a.hashCode() == b.hashCode()`)
    - different objects may still have equal hashcodes, though this is discouraged
      (meaning it is ideal, but not enforced that if `a.equals(b)==false` then `a.hashCode() != b.hashCode()`)

### 1. task

Take the `Vector` class from the previous example and write it's `equals()` and `hashCode()` methods. Create unit tests to test them
according to our expectations of them.

### 2. task

Modify the `equals()` method of the `Person` class of task 7 of lesson 3 so that it will suit our expectations of it and
write a `hashCode()` method accordingly.

### 3. task

Create a generic `Bag<T>` class representing a bag. A bag is a set that may contain duplicates of it's elements.

Add a `HashMap<T, Integer>` datamember to it which will be initialized by a parameterless constructor. Add an `add(T element)` method to it.
This will check if the key is already present in the bag: if it's not, add it with value 1, otherwise get it's current value and increment it by 1.
(The map will track how many instances of each element is in the bag.)

Add a `countOf(T element)` method to it returning an `int` that returns how many duplicates of the element is in the bag.
If there is no such key in the bag, return `0`.

Add a `remove(T element)` method for removing an element. This will decrement the value of the given key by `1` in the bag.
If the value drops to `0`, remove the corresponding key-value pair from the map so that no superfluous data is stored.
If the element was not in the bag throw a `NotInBagException` exception which is a user defined exception class.
The `NotInBagException` exception inherits from `Exception` and it's constructor expecting a string parameter should call the super class' constructor.

Create a main program which will process an input text file containing a word in each line and counts how many times each word appeared in the input
file using the `Bag<T>` class.

input.txt:

```
hello
world
interface
abstract
abstract
world
world
world
hello
world
X-Files
protected
abstract
abstract
extends
protected
socket
world
hello
socket
extends
```

### 1. practice task

Create a `Circle` class containing the `x` and `y` coordinates of it's centre as well as it's `radius` in three `float` fields.
The constructor will take and store those parameters. Add getters for each of those fields.
Override the class' `hashCode()` and `equals()` methods. The `equals()` method will check if two circles are identical, meaning their radius
is the same length. It should NOT check for identical centers! (Note: this means that the value of `hashCode()` should also not
depend on the coordinates of the centre, since that way it could produce different hashcodes for circles considered equal.)
Create unit tests to test `equals()` and `hashCode` according to our expectations of them.

### 2. practice task

Create a generic `CheckedSet<T>` class representing a set. Add a `HashSet<T>` datamember to it which is initialized by a parameterless constructor.
Add a method for getting the current size of the set. Add an `add(T element)` method that may throw an `AlreadyContainedException` checked exception.
Create such a user-defined exception class that is thrown when the set already contains the given element; otherwise add the element to the set.
Add a `contains(T element)` method returning a `boolean` that checks if the set contains the given element. Test the new class in a main program
by instantiating circles of different radii (with equal or not equal centers) as well as circles of equal radii, yet different centers.