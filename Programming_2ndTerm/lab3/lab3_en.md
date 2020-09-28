# Programming Languages / Java (BSc), 3rd lab


### Task 1

Create a class `Foo` in the package `packagename`. The class should contain
a field and a method. The package should also contain a `Main` program,
which instantiates `Foo` and calls its method.

Create another `Main` class in package `otherpackage`. This should also
instantiate the `Foo` class defined in package `packagename`.

### Task 2

Reorganize the code of class `Point` and the corresponding main program
as produced in the previous lab. In the reorganized code, those classes
should go to the `point2d` package. Ensure that the `Point` class is
not visible from outside of its package. The `Point` class and the
main program should be written as two compilation units.

### Task 3

Change the code produced in Task 2 in a way that the main program goes
into different package, `pointm`.

### Task 4

Create a package `circle` and its sub-package `utils`. Class `Point` should
now be put into this `circle.utils` package. Create the `circle.Circle`
class, which stores the radius of the circle (`double`) and the center of
the circle (class `circle.utils.Point`). Create a main program as class
`circle.Main`.

### Task 5

Modify the code for Task 4 in such a way that the fields in the classes
`Point` and `Circle` are not visible from outside of the containing classes.
The access to the fields should be provided by constructors and getter/setter
methods.

### Task 6

Create a class `stringutils.IterLetter`. Its constructor expects a `String`
reference. (Make sure that your code handles the case when this reference
is `null`.) Create a method `printNext()` in this class, which prints the
next unprinted letter of the initialising string in a new line on the
standard output. (The first call of the method prints the first letter,
the second call prints the second letter, and so on).

After all the letters of the string have been printed, the `printNext()`
method should not print anything anymore.

The class should have a `restart()` method, which can be used to
re-initiate the printing functionality. After `restart()`, the
`stringutils.IterLetter` object should print the first letter of the
initialising string for the following `printNext()` method.

Finally, add a `hasNext()` method, which returns `true` if (and only if)
there are letters to be printed in the string.

Create a main program in `Main` in the anonymous package. The main program
should instantiate class `stringutils.IterLetter`, and illustrates its
use.

### Task 7

Create an enumeration type `Gender` containing the two values
`Gender.MALE` and `Gender.FEMALE`. Create class `Person` to hold
personal data: surname, given name (both `String`), occupation
(`String`), gender (`Gender`) and year of birth (`int`).

The class should have a constructor accepting initialisation values
for all the attributes.

Create a method `toString()` in the class, with return type `String`.
This method converts personal data to a formatted string.

Create a `sameAs(Person that)` method as well, which returns true if
(and only if) the current person has the same personal data as the
"`Person that`", passed as parameter. Be careful with a possibly `null`
parameter. For such a parameter the method should return `false`.

The `Person` class and the `Gender` type should be in package `person`.
Create a main program in package `main`. The main program should create
two person objects, and checks whether they are the "same". The result
of the comparison and the two objects should be printed on the standard
output.


### Exercise 1

Create a class `Kangaroo` representing kangaroos. This class should have
two fields: one represents the name (`String`) and the other the age
(`int`) of the animal.

The constructor of the class takes two parameters, corresponding to the
two fields. The class should contain a method `display(String)`, which
takes the name of a country as parameter, and does the following:
it prints the name of the kangaroo, as well as the name of the country;
then it increases the age of the kangaroo by one, and prints the new
age.


### Exercise 2

Add a `stringutils.IterWord` class to the `stringutils` package.
The constructor in this class takes a string as parameter. The
`printNext()` method prints the next *word* of this string to
the standard output (in a new line). The class whould have a
`restart()` and a `hasNext()` method as well. Create a main
program to illustrate the use of the class!

### Exercise 3

Create a class `Book` representing a book in a library. A book has
a title (`String`), an author (`String`), a field to store the year
when it was published (`int`), a field for the number of pages (`int`),
and a logical value describing whether the book can be borrowed.

Create a constructor which requires all the above attributes of a
book. Create another constructor which takes a `Book` reference
as parameter. (Do not forget about the case when the parameter
is `null`.)

Create a method `toString()` to convert the book data into a `String`.
Create a `sameAs(Book)` method which returns true if the parameter
book has the same title, author, year and pages as the current book.
(Whether the books can be borrowed does not matter when comparing them.)

Create a main program to illustrtate the use of the class.
Put all classes into the package `library`.

### Exercise 4

Create the class `game.utils.Vehicle`, which represents a vehicle in a
multi-player game. Such a vehicle has a model id (`int`), a registration
number (`String`) and two colors: `color1` and `color2` of type `int`.
Create getter and setter for the registration number.

Create a class `game.Player` representing a player in a multi-player
game. A player has a name (`String`), an IP-address (`String`), an
integer value describing their health, and their vehicle (of type
`game.utils.Vehicle`). If the player has no vehicle, a `null`
reference should be stored.

Create the `toString()` method in the `game.Player` class to convert
player data to string, including the name, the IP-address, health
status, and -- if they have a vehicle -- the registration number of
the vehicle.

Create the main program in the class `game.Main`, which instantiates
three vehicles and two players. One of the players should own a vehicle.
The program should print the players' data on the screen.

