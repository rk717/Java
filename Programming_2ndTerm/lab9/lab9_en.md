# Programing languages (BSc, 18) Java Lab 9

## Lab exercises

### Exercise 1

Create a `divisors` function which takes two positive integers as parameters and returns their divisors in a list data structure.

### Exercise 2

#### A)

Create a `Book` class representing a generic book. A `Book` has three fields: `author` (`String`), `title` (`String`), and `pageCount` (`int`). Create a `PrintedBook` and an `EBook` class extending from `Book`. A book's author and the title should only be accessible to `Book`, while pageCount should be accessible to its subclasses.

The `Book` class has two constructors:

1. A constructor that takes the `author`, `title`, and `pageCount` as parameters and sets the corresponding fields. Make sure that the length of `author` is at least two, while the `title`'s length is four or greater. If either one is incorrect, throw an `IllegalArgumentException`

2. A constructor that takes no arguments. It calls the previously deffined ctor with the following values:

    * `author`: John Steinbeck
    * `title`: Of Mice and Men
    * `pageCount`: 107

Add a `getShortName` method to `Book`, that returns a string composed of the first two chars of the `author`, first four chars of the `title`, and the `pageCount`.

Write a main class that constructs two `Book`s, one with each constructor, then prints their short names (`getShortName`) to the console.

#### B)

A printed book can have two cover types: `Softcover` and `Hardcover`. Create an enum to store these values. The `PrintedBook` class stores it's cover type in a field.

A `PrintedBook` must be constructible with and without parameters.

* Without parameters: call the superclass's parameterless constructor, set the `coverType` to `Hardcover`, and add six to `pageCount` to account for the additional pages added in print.
* With parameters: take all four fields and set them. (`author`, `title`, `pageCount`, `coverType`)

The `EBook` class stores its `fileSize` in an `int` field. An `EBook` instance can only be constructed by providing these parameters: `author`, `title`, `pageCount`, `fileSize`.

Add a `getPrice` method to `PrintedBook`, and `EBook`, it calculates the books price in the following way:

* For `Softcover` printed books the price is equal to: `pageCount * 2`
* For `Hardcover` printed books the price is equal to: `pageCount * 3`
* For `EBook`s the price is equal to: `pageCount + fileSize`

In `Main` instantiate `PrintedBook` and `EBook`. Print their short names and prices.

#### C)

Supplement the `Book` class with a `toString` method. It returns the book's author, title and page count.
For `EBook`s, this `toString` is sufficient. `PrintedBook` should override this method by extending its parents `toString` with its `coverType`.

Books often get referenced in articles for these use cases you need to create a reference catalog. Depending on the book type, it includes `author`, `title`, and the cited pages.

Add a `createReference` method to `Book`. `createReference` takes an article's title (`String`) and a start and end page for the citation, and returns a string reference pointing to a book.

The reference's format is as follows: "`getShortName()` [start page - end page] referenced by article: `<article title>` "

For printed books and e-books, the formatting is different. Override `createReference` in `PrintedBook` and `EBook`.

For printed book the format is:
"super class's `toString()` [start page - end page] referenced by article: `<article title>` "

For digital books the reference format is:
"super class's `toString()` (File size: `<file size>`) [start page - end page] referenced by article: `<article title>`"

When using digital source materials, it's a good idea to indicate the date of use. Overload the `EBook` class' `createReference` method. This new `createReferece` should take an article's title and the date of use.
It returns a reference in this format: "super class's `toString()` (File size: `<file size>`) referenced by article: `<article title>`, file's use date: `<date of use>`"

#### D)

Write a `isSameAuthor` function, taking two `Book` references and returning whether the two books authors match. Call this function with a selection of `Book` and `Book` subclass instances.

## Practice exercises

### Exercise 1

__Prerequisites:__
`Point.java`, and `Circle.java` from lab 6, exercise 1.

__Task:__
Create the `ColouredPoint` class, which extends `Point`. Add a nested enum called `ColouredPoint.Colour`, with the following values: `RED, GREEN, BLUE`.
The `;` class has a private `Colour` field, provide public read/write access to this field.
Additionally, create a `ColouredCirlce` class inheriting `Circle`.  The colour of the circle is determined by its center stored as a `ColouredPoint` instance, provide a getter for the colour.
Test the two newly created classes with white-box principals.

### Exercise 2

In this exercise, we'll be simulating a cafe. For this, we need a `Barista` who'll be serving our `Guest`s.
There are two types of guests: `Adult` and `Minor`, both inherit `Guest`. The barista servers `Beverage`s to guests.

First, implement the `Beverage` class with the following fields:

* `name`, a non-empty string
* `legalAge`, a positive integer

Create a constructor that receives these values and sets them, throw an `IllegalArgumentException` if either field is incorrect. Additionally, create getters for them.

The `Guest` class has two protected visibility fields:

* `name`, string
* `age`, int

Both of these fields should have getters.

The barista has a public method called  `order`, it takes a `Beverage` and a `Guest` as parameters and returns a boolean value. It's false when the `legalAge` of a drink is 18 and the `Guest` isn't an `Adult`

### Exercise 3

Write a `Stream` class that will produce character sequences, and a `Logger` which will log these strings.

The `Logger` class has a single function with no return value:

* `log`, it takes a String parameter, leave it's body empty

The `Stream` class takes the following arguments and stores the as private fields, throw an `IllegalArgumentException` if an argument is incorrect:

* The maximum length of a char-sequence (`maxStringLenght`)
* The number of strings to generate (`stringNumber`)
* A `Logger` which receives the generated strings

First, create a public `startStreaming` function, which calls `Logger::log` `stringNumber` times with the generated random string.

Create 3 subclasses of `Logger`: `ConsoleLogger`, `ConsoleCipherLogger`, and `FileLogger`. Each subclass should override the `log` function.

* `ConsoleLogger::log` prints received string to standard out.
* `ConsoleCipherLogger::log` is identical to `ConsoleLogger` but it "encrypts" the string with a Caesar cipher.
* `FileLogger::log` writes the received strings to a file, line by line

The `Main` class tests these classes.

### Exercise 4

Make a data structure representing a list of whole numbers, and call it `IntList`.

#### A)

Implement an `IntList` with an array.

It stores these fields:

* `currentSize`: `int`
* `maxSize`: `int`
* `array`: `int[]`

The constructor gets the max size as a parameter.

The class proivdes the following methods:

* `add` takes and `int` and stores it in our list
* `concat` takes another `IntList` instance and adds it's contents to the end of this list, provided this list has sufficent capacity. If the current list doesn't have enough capacity, throw an `IllegalStateException`.
* `removeItemsGreaterThan` takes an int (`limit`), and removes every element that's greater than the limit.

Override `toString` to show a comma-separated list of numbers found in our `IntList`.
If the list is empty print 'empty'.

#### B)

Implement the same `IntList` but this time it should be backed by either an `ArrayList` or a `LinkedList`.
(What are some of the benefits of this implementation over the one from A))
Additionally create a constructor that initializes the `IntList` with an integer array.

#### C)

Extend the `IntList` class from sub-task B). Call it `NamedIntList` and add a `name` (`String`) field.
Add a `name` parameter to both constructors. Finally, override the `toString` method inherited from it's super class to indicate the name of the `NamedIntList`.
