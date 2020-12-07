# Programming languages / Java (Bsc) Lab 8

### Task 1

Open a Java Shell (`jshell`) and play around with the bitwise operators
provided by the Java language (which are similar to those provided
by the C language).

- Check the value of `0xBEE_FACED_BABE_ADEL`.
- Try the operators `&`, `|`, `~`, `^`, `<<`, `>>` and `>>>`. 
- What are the prime factors of 1984? How many times can you divide it by 2?
  How do you express this with `>>`?

### Task 2

#### a

Prepare the enum type `datastructures.Month`,
which contains the names of the months.

#### b

Prepare a class named `datastructres.mutable.SetOfMonths` which will represent
a set of months in a field of type `short` in such a way that the field's
`i`-th bit is 1 exactly when the `i`-th month is in the set, otherwise it's 0.
You will have to use the bitwise operators `&`, `|`, `<<`, `>>` and `^`. 

The class must have a private constructor, which accepts and stores a given
`short` parameter. To make a `SetOfMonths` object, the class must have a
class-wide public method called `empty()`, which returns a `SetOfMonths` object
reference, with its field set to 0.

Prepare an `add()` method, which inserts a `Month` into the set.
Solve that the `add()` function can be called in a chained manner.
(For instance:
`example.add(May).add(September).add(October)` where `example` is a reference
to a `SetOfMonths` object. This should insert the months one after the other
into the same set.)

Prepare another `add()` method with a string array parameter, which inserts the
months with the provided names into the set. 

~~~{.java}
example.add( new String[]{"July", "April", "May"} );
~~~

Prepare a `contains()` function which decides whether the given parameter is in
the set.

Prepare a `remove()` method which removes the given month from the set. This
method can be called in a chained manner, just like `add()`.

Prepare a `toString()` function which returns a string representation of the set
in the following format: `{month1, month2, ..., monthN}`.

Prepare an `of()` variadic class-wide function which accepts any number of
`Month` parameters and returns a new `SetOfMonths` object.

Prepare two methods which can, respectively, read and write a `SetOfMonths`
object from/to a binary file. The writer method writes the `short` field
into the file (two bytes), and the reader method restores the value of a
`SetOfMonths` by reading those two bytes as a `short` value into the field
of the object.

You can open a binary file for writing in the following way:

~~~{.java}
DataOutputStream out = new DataOutputStream( new FileOutputStream( fname ) );
~~~

You can write a `short` value into the file with the `out.writeShort(aShort)`
method. Reading is similar.

#### c

Prepare another `SetOfMonths` class, which is similar to the one above, but
which is immutable. Name it as `datastructures.immutable.SetOfMonths`.

So your task is the following. Prepare the class and its operations in a way
that the stored field of type `short` is never modified. Operations such as
`add()` or `remove()` should construct new `SetOfMonths` objects with an
updated content.

<https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html>


### Exercise 1

Define an `UnmodifiableStringArray` type, which is an immutable representation
of an array of `String`s.

The constructor of `UnmodifiableStringArray` has a `String[]` parameter.
The class has the following methods:

- `size()`: the number of `String` elements
- `maxLength()`: the length of the longest element in the array
- `minLength()`: the length of the shortest element in the array
- `allLength()`: the sum of the lengths of the elements in the array
- `contains(String str)`: decides whether `str` is in the array
- `empty()`: a class-wide method, returning an `UnmodifiableStringArray`
- `get(int index)`: returns the element at the given index
   (if the element does not exist, it throws an `IllegalArgumentException`)
- `set(int index, String str)`: returns a new `UnmodifiableStringArray` object
   with the element at the given index set to `str`, otherwise equal to the
   current object (if the given index is larger then the size of the current
   object, it throws an `IllegalArgumentException`)
- `find(String str)`: returns `str` if it is in the array, otherwise `null`
- `sort()`: returns a lexicographically sorted copy of the
   `UnmodifiableStringArray`
- `getAllItems()`: returns an array of the stored `String` values
   (be careful, the internal state of our object should not escape!)

Prepare tests for the methods above!

