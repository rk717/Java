# Programming languages, Java (BSc) -- Lab 8


## Explanation

Compile and run `SimpleTest.java` in the following way:

```
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar SimpleTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore SimpleTest
```

### Task 1

Create a class `MathUtils` containing a static method `Increment()`, which increases
an integer number by one in a safe way: it only increases its parameter if it is not
the largest representable `int` value. The result of the computation should be
returned by this method.

Test the `Increment()` method with white-box testing.

### Task 2

The `Book` class represents an item (a book) at an auction.

Test the `Book` class with white-box testing. Try to maximize the
following metrics.

- coverage of methods
- coverage of branches (both branches of each decision point)
- coverage of conditions (subconditions in boolean expressions)
- coverage of loops (execution of loop bodies 0, 1, 2 times)

The class contains a nested enumeration type (`Book.Genre`),
which contains the following values:
`FANTASY`, `SATIRE`, `SCIFI`, `PHILOSOPHY`, `EDUCATIONAL`.

The class has 5 private fields.

- author (`String`)
- title (`String`)
- reserve price (`int`)
- identifier (`int`)
- genre (`Book.Genre`).

The class has a private constructor: it takes as parameter the
author, the title, the genre and the reserve price, and sets the
corresponding fields. The identifier should be initialized to a
value which is larger by one than the previously assigned identifier.
(The first identifier should be `0`.)

The class contains a static `make()` method.
This method takes almost the same parameters as the constructor. The only
difference is that the genre is represented as a `String` rather than a
`Book.Genre`.
The `make()` method checks that the parameters are valid and meaningful.
In the positive case, it constructs and returns a new `Book` object, otherwise
it returns a `null` reference.

- The name of the author and the title are accepted, if they are not `null`,
they contain at least two characters, and they only contain letters, digits and
spaces.
- The reserve price should be a positive value.
- The genre should be convertible into a `Book.Genre` value.

Prepare a static method `isSameGenre()`, which takes two `Book` objects
as parameter and returns whether they have the same genre.

Create a `compare()` instance method, which takes another `Book` object
as parameter. This method can only compare books from the same genre -
if called with books of different genres, the method should throw an
`IllegalArgumentException`. When two books of the same genre are compared,
they are compared based on the reserve price: the larger the reserve price,
the "larger" the book is. If the current book is larger than the one passed
as parameter, the `compare()` method should return 1; if smaller, it should
return -1; and if equal, it should return 0.

### Task 3

The `Adder` class has an `add()` static method with two parameters representing numbers,
and it returns their sum. For some reason, the type of the parameters and the return type
are `String`s. Therefore, numbers must be encoded to strings before calling this method,
and the result should be also decoded. If the parameter strings cannot be interpreted as
numbers, the method should throw `IllegalArgumentException`.

```{.java}
public class Adder {
    public static String add(String a, String b){...}
}
```

Test the `add()` method with black-box testing, taking care of the following.

- the correct implementation of addition;
- the algebraic properties of addition: commutativity, associativity, unit value;
- for floating point numbers, precision up to `0.01`;
- ability to accept numbers in radix 2;
- ability to accept numbers written in English;
- invalid parameters (`null` or non-numbers) result in `IllegalArgumentException`
- ability to ignore spaces at the beginning and at the end of the strings.

### Exercise 1

Implement the
[`Stack` data structrure](https://en.wikipedia.org/wiki/Stack_(abstract_data_type))
in the following way.

- A `Stack` stores `int` values.
- It provides the following two operations:
    - `push()`: inserts an element into the top of the stack;
    - `pop()`: removes the element from the top of stack (the one which was last *pushed*),
      and returns this value.
- Then, it has an `empty()` method to check whether the stack is empty.
- Finally, its `size()` method returns the number of elements stored in the stack.
- If `pop()` is called on an empty stack, the method should throw a
  `java.util.NoSuchElementException`.

Test the implementation using the learnt test environment in the following way.
Check that

- the element pushed last is the one which is popped first;
- a freshly constructed stack is empty;
- a stack containing one element is not empty;
- it is not possible to pop from an empty stack (i.e. whether the exception is thrown);
- the `size()` method works properly in corner cases (0, 1);
- if the last element is popped, the stack becomes empty.

### Exercise 2

Implement [Caesar-chipher](https://en.wikipedia.org/wiki/Caesar_cipher) for the English alphabet.
Create a `Caesar` class in the following way.

- The shift value is passed as parameter (`n`) to the constructor and is stored;
    - if `n` is not between 1 and 25, the constructor should throw `IllegalArgumentException`
- the class should have a `cipher()` method, which encodes an English text with shifting by `n`;
    - this operation throws an exception if it detects a character not in the English alphabet;
- The class should have a `decipher()` method as well (this method need not check for invalid characters).

Test your solution in a data-driven manner, by providing (at least 5) pairs of plaintext and ciphertext.
Use [Parameterized tests](https://github.com/junit-team/junit4/wiki/Parameterized-tests) of JUnit.

Try to use the testing library
[Hamcrest](http://hamcrest.org/JavaHamcrest/tutorial) for *assertions* instead of the
more basic JUnit `assert*` operations!

Extend the set of parameters with the shift value (`n`), and perform the tests
for at least three different values of `n`.

Prepare *negative test cases* as well, which check whether illegal parameters
are handled properly (by throwing exceptions).

### Exercise 3

Test the solution of exercise 4 in lab 5 using JUnit!
This requires the separation of input, sum and output.
Organize these steps into static methods in such a way
that they become independent, so the only way they can interact is
through parameters and return values.

Create a separate test class for the three operations. Make sure that each test
class tests only the corresponding logic (method).

Create example inputs (text files) for the testing. Avoid redundant, repetitive
code by using parametrized tests. Strive for brevity in the case of complex checks
(use the Hamcrest matcher library).

When testing sum and output logic, we may assume that input works properly,
so we can use the input operation to prepare the test cases. Read in the
contents of an input text file into a field before executing the test using
the input method. Use the `@Before` annotation
([help](https://www.baeldung.com/junit-before-beforeclass-beforeeach-beforeall))!

Make sure that exceptions are only handled in those test cases which were
prepared for this case. In any other cases, ensure that successfuly opened files
are properly closed
([hint](https://www.baeldung.com/java-wrapping-vs-rethrowing-exceptions)).

Try to test as many possibilities as you can, and pay attention to corner cases
(empty file, empty line, line containing one item etc.).

