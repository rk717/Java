# Programming languages / Java (BSc, 18) 4th lab



### Task 1

Create a program which reads (from standard input) the coordinates of
three `Point` objects, and instantiates three such objects, storing their
references in an array.

Then the program should compute the *center of mass* of the points,
and print out this point on the screen. (The coordinates of the center
of mass is defined as the average of the corresponding coordinates
of the original points.)

### Task 2

Modify the previous program in such a way that the computation of the
center of mass is performed by a static method of the `Point` class.
This method takes the input points in an array, and provides the result
as a return value.

### Task 3

Draw the memory map of the following Java programs. (Present the contents
of the execution stack and the heap during the execution of the programs.)

Main.java:

~~~{.java}
class Foo {
    private int x;

    public Foo(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        int counter = 0;

        Foo obj = new Foo(5);
        counter = 10;

        obj = new Foo(7);

        // 1. Which objects can be removed by the garbage collector?

        Foo obj2;
        new Foo(20);
        obj2 = obj;

        // 2. Which objects can be removed by the garbage collector?

        obj2 = new Foo(30);
        obj2 = new Foo(20);
    }
}
~~~

Main2.java:

~~~{.java}
public class Main2 {
    public static void main(String[] args) {
        String s1;
        System.out.println("len of s1 = " + s1.length());

        String s2 = "";
        System.out.println("len of s2 = " + s2.length());
        s2 += "hello";
        s2 += "world";

        // Which objects can be removed by the garbage collector?

        System.out.println("len of s2 = " + s2.length());
    }
}
~~~

### Task 4

Create the class `IntegerMatrix` with the following operations.

- A constructor expecting three arguments:
    - `int rowNum` (number of rows in the matrix);
    - `int colNum` (number of columns in the matrix);  
    - `int[] linearData` (an array storing the elements of the matrix in
      a row-major manner, i.e. `{1,2,3,4,5,6)` for the $2 \times 3$ matrix
      below).

$$
\begin{bmatrix}
1 & 2 & 3 \\
4 & 5 & 6
\end{bmatrix}
$$

- A `toString()` method, which produces a character string from the
matrix elements, separating rows with semicolon (`;`), and elements
within a row with comma (`,`). The string representing the matrix
above is: `"1,2,3;4,5,6"`.

### 5. feladat

Correct the errors in the program code below.

Create the `IntVector` class in package `util`, which represents
a sequence of integer numbers! The class should have a field of
type integer array, this will store the elements of the sequence.
The class should have a constructor, which takes an array of
integer numbers and initializes the `IntVector` with these numbers.
(Make sure that the inner representation of the class does not
escape from the class definition!)

Add a method named `add(int n)`, which adds `n` to each element of
the sequence! Prepare a `toString()` method producing a character
string. This method should enumerate the elements of the sequence
in brackets, separating consecutive elements with a space
(for example: `[1 2 3]`).


util/IntVector.java:

~~~{.java}
package util;

public class IntVector {
    int[] ns;

    IntVector(int[] numbers) {
        ns = numbers;
    }

    public void add(int n) {
        for (int i = 0; i < ns.length-1; i++)
            ns[i] += n;
    }

    public String toString() {
        return Arrays.toString(ns);
    }
}
~~~

IntVectorDemo.java:

~~~{.java}
class IntVectorDemo {
    public static void main(String[] args) {
        int[] ns = new int{1,2,3};
        IntVector v = new IntVector(ns);
        IntVector v2 = new IntVector(ns);

        System.out.println(new int{1,2,3});
        System.out.println(v);
        System.out.println(v2);

        System.out.println("v.add(1);");
        v.add(1);
        System.out.println(v);
        System.out.println(v2);

        System.out.println("ns[0] = 10;");
        ns[0] = 10;             
        System.out.println(v);
        System.out.println(v2);
    }
}
~~~

