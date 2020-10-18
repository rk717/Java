# Programming languages / Java (BSc, 18) 5th lab



### Task 1

Modify the solution of **Task 7** of the **1st lab** so that operands have type `double` and the operations to be performed are provided as command line arguments. No need to extend the set of supported operations.

In case the program is called with insufficient number of arguments, it shall throw an `IllegalArgumentException` in its `main()` method. Throw an `ArithmeticException`  in case of diving by zero and, in case of an unsupported arithmetic operation also throw an `IllegalArgumentException`.

### Task 2

Modify **Task 1** so that exceptions are caught in `main()` and appropriate error messages are printed to the console instead (eg. `"Invalid program`
`arguments provided."`, in case of a missing argument). Also catch the exception thrown by `parseDouble()` in case of an invalid string.

### Task 3

Modify **Task 2** so that each exception thrown by you is provided with an appropriate error message in its constructor. When catching these exceptions print **these** messages to the console.

### Task 4

We have an input file containing integer numbers separated by commas. Your task is to calculate the **sum** of values in each line and print result (lines of sums) to another file.

```
1,2,5,-2
10,20,0,7
3,2
2
0
1,2
3
```

Use `BufferedReader` in your solution!
Look for a method in the `String` class that is capable of splitting a line around some special character (comma, in our case)!

We can assume the input file's format is always valid.

### Task 5

Look up some string in a text file! The file name is provided as command line argument, the string should be read from the console.

Print the number of lines containing an occurrence of the string to the console!

Partial matches also count. That is, the line can contain other text beside our string and still count as an occurrence. (Try finding a relevant method in the `String` class!)

```
hello
__hello2
hello
	hello
	
				hello


```

### 

### Exercise 1

Create a program that prints characters to the standard output from some text file (`in.txt`)!

Read the number of characters to be printed from the standard input!
An integer value can be provided as command line argument that specifies how many lines shall be skipped after each read character (use the `skip()` method of the `BufferedReader` class).

Use the `BufferedReader` class's `read()` method to read a file character-by-character!

Handle exceptions arising during reading, or parsing of the command line argument, and during reading from console (`NoSuchElementException`, `InputMismatchException`)!

### Exercise 2

We have a text file with each line containing one integer number and, after that, a list of integer numbers separated by commas. 

Read the file and find the lines that contain a list of integers such that the sum of two of them is exactly the integer in the first column.

Write the result into a text file:
Each line must contain the first integer in the input file and the two integers in the list that are its summands. If the list contains no such numbers print the string `"none"` after the first integer instead.

Example:

in.txt:

```
7 2,5,-7,6,9
-2 2,5,-7,6,9
12 2,5,-7,6,9
```

out.txt:

```
7 2 5
-2 5 -7
12 none
```

### Exercise 3

Create a program using the **NIO API**. Read numbers from a text file called `nums.txt` using a `BufferedReader` object and print their parity to the file called `out.txt` using a `BufferedWriter` object. The resulting file shall look like this:

```
x is an even number
y is an odd number
```

where x and y are some integers. The input file has one integer per line. Use the **try-with-resources** idiom!



