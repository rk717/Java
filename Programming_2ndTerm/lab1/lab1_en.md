# Programming Languages (Java), 1st lab


### Task 0

Find the home page of the course. Discuss how evaluation will happen.
Check Canvas. Homework: study the home page.

### Task 1

Create the shortest possible compilation unit in Java.

~~~{.java}
class A{}
~~~

Compile it using the `javac` command!

~~~
javac A.java
~~~

Check the generated `.class` file! Open this file with a
text editor. As you can see, it's a binary file, but you can
observe some meaningful identifiers in it.


### Task 2

Create the Java program which does not do anything!
For this, an empty main program is required. This is
the shortest possible program in Java. (Well, you
could use shorter identifiers instead of `Skip` and
`args`, and you could remove some whitespaces still.)

~~~{.java}
class Skip {
    public static void main( String[] args ){
    }
}
~~~

Compile this class and run the program!

~~~
javac Skip.java
java Skip
~~~


### Task 3

Create a program which reads the name of the user from the console,
and then greets the user. You can use the following two commands:

~~~{.java}
System.console().readLine()
System.console().printf(...)
~~~

### Task 4

Create a program similar to the previous one, but this time the name
of the user should be provided as the first command-line argument!
Printing to the standard output is also possible using the following
command, which Java programmers usually prefer.

~~~{.java}
System.out.println(...)
~~~

### Task 5

The program below should print the half of the numbers 1, 2, 3 and 4.
The expected output is:

~~~
0.5
1.0
1.5
2.0
Altogether 4 numbers are printed!
~~~

However, the program fails to work. Fix it!

~~~{.java}
class Print {
    public static void main() {
        for( int i = 1; i < 4; i++ ) {
            System.out.Println(i/2);
        }
        i = 4;
        System.out.println("Altogether " + i + " numbers are printed!")
    }
}
~~~


### Task 6

Create a program which inputs two integer numbers, and for each integer number
in the range defined by these two integers, it outputs the half of those
numbers. To convert a string (provided as input) into an integer number,
you can use the following conversion function:

~~~{.java}
Integer.parseInt(...)
~~~


### Task 7

Create a program which converts its first two command-line arguments
into integer numbers, and computes their sum, difference, product,
as well as the quotient and remainder of integer division. The integer
division should not be performed when the second number is zero. The
results should be printed on the standard output. The program should
print an error message if less than two command-line arguments were
provided. The error message should be printed on the standard error
(`System.err`) stream.

### Task 8

Implement a program which computes the factorial of a given natural
number.

### Exercise 1

Create a program which takes its first command-line argument as an
integer number, and decides whether this number is a *perfect number*.
In number theory, a natural number is called perfect, if the sum of
its positive divisors (excluding the number itself) is equal to the
number. (Or, equivalently, the sum of the positive divisors equals to
two times the number.) The first four perfect numbers are: 6, 28, 496
and 8128. For example, $6 = 1+2+3$.

### Exercise 2

Change the previous program in such a way that it computes how many
perfect numbers are in the range between 1 and the number given as
the first command-line argument!

### Exercise 3

Compute the greatest common divisor of the (positive or negative)
integer numbers provided as command-line arguments! Your program
should convert all of its command-line arguments into integer
numbers, and compute their greatest common divisors.

The command-line arguments and the result should be represented with
`long` values. This type is a 64-bits signed integer type. To convert
a string to this type, use the `Long.parseLong(...)` function!


### Exercise 4

Write a program which computes the square root of a number using the
Babylonian-method. Given a number $S$, its square root can be approximated
by the sequence $x_n$ defined below. Your program should input the real
number $S$ and another real number $\epsilon$. The latter will describe
the expected precision of the approximation. Use the double precision
floating point type `double` to store numbers!

Compute the first few elements of the $x_n$ sequence, until the difference
between two consecutive elements is smaller then $\epsilon$.

$$x_0 = {S \over 2}$$
$$x_{n+1} = {1 \over 2} \left( x_n + {S \over x_n}\right)$$

To convert a string to the `double` type, the function
`Double.parseDouble(...)` can be used.


### Exercise 5

Compute an approximation of $\sqrt{2}$ using the following
*continued fraction*.

$$\sqrt{2} - 1 = {1 \over {2 + {1 \over {2 + {1 \over {2 + \dots}}}}}}$$

### Exercise 6

Compute an approximation of $e$ using the following continued fraction.

$$e - 1 = 1 + {1 \over {1 + {1 \over {2 + {1 \over {1 + {1 \over {1 + {1 \over {4 + {1 \over {1 + {1 \over {1 + {1 \over {6 + \dots}}}}}}}}}}}}}}}}$$

### Exercise 7

What's wrong with this program? Fix it!

~~~{.java}
class Odd {
    public static void main( String[] args ){
        if( args.length != 1 ){
            System.err.println("Give exactly one integer number as an argument!");
        } else {
            int num = Integer.parseInt(args[0]);
            String answer = (num % 2 == 1) ? "odd" : "even";
            System.out.println( answer );
        }
    }
}
~~~

