# Programming Languages (BSc) Java, 2nd lab


### Task 1

Create a `Point` class containing two fieds, `x` and `y` of type `double`.
Create a method `move(dx,dy)` which can translate a point with coordinates
`dx` and `dy`. Create a method `mirror(cx,cy)` which can reflect a point
through the coordinates `cx` and `cy`.

Create a `PointMain` program to test the use of the `Point` class.

### Task 2

Rewrite the `mirror` method in class `Point` in such a way that it has
a single parameter of type `Point`, representing the point through which
the reflexion should be performed.

Create a `distance(p)` method, which computes the distance of a point from
the point `p` (provided as parameter). Use the `Math.sqrt(...)` function
and the Pythagorean theorem.

Update the `PointMain` class to test the new operations!

### Task 3

Implement the `Complex` class representing complex numbers with a real
and imaginary component. The class should contain fields `re` and `im`
of type `double`. Create a method `abs()` which computes the absolute
value of the complex number.

Implement the `add(c)` and `sub(c)` and `mul(c)` methods, which, respectively,
add another complex number `c` to a complex number, subtract `c` from the
complex number and multiply the complex number with `c`. These methods
should be used as, and should behave like, illustrated below.

~~~{.java}
alpha.re = 3
alpha.im = 2
beta.re = 1
beta.im = 2
alpha.add(beta)
// alpha.re == 4 && alpha.im == 4 && beta.re == 1 && beta.im == 2
~~~

### Task 4

Create a class `Circle` representing circles with an origin (fields
`x` and `y` of type `double`) and a radius (field of type `double`).
Create a method `enlarge(f)`, which multiplies the radius with `f`,
enlarging the circle with a factor `f` (or shrinking if `f` is smaller
than 1). Create a method `getArea()` which computes the area of the
circle. Use the constant `Math.PI`!

### Task 5

Create class `Line`, which can represent lines on a plane.
A line is characterized by its points $(x,y)$, which satisfy
the equality $ax + by = c$. The fields of the `Line` class
will be `a`, `b` and `c`, all of type `double`.

Create a method `contains(p)`, which decides whether the point `p`
lies on the line.

Create the methods `isParallelWith(l)` and `isOrthogonalTo(l)`, which
decide, respectively, whether a line is parallel to, and orthogonal
(perpendicular) to the line `l` provided as a parameter.

### Task 6

Write the `Distance` program, which interprets its command line
arguments as a sequence of points, and sums up the distances found
between any two consecutive points (i.e. the length of a polygonal
chain, or polyline). The first two command line arguments represent
the `x` and `y` coordinates of the first point, then the third and
fourth command line arguments represent the second point, and so on.
We can assume that the number of command line arguments is even,
and each command line argument is an integer number.

The program should work by using the `Point` class and its `distance`
method. For example, if the six coordinates of three points are
provided as command line arguments, the program should compute the
distance between the first two points, as well as the distance of the
last two points, and print the sum of these two distances.

Examples:

~~~
> java Distance
0.0
> java Distance 1 2
0.0
> java Distance 0 0 3 4
5.0
> java Distance 1 2 4 6
5.0
> java Distance 1 2 4 6 7 6
8.0
~~~

### Exercise 1

Create the method `conjugate()` in class `Complex`, which turns a complex
number to its conjugate. Create the method `reciprocate()` as well, which
turns the complex number to its reciprocal. Implement the `div(c)` method,
which divides the complex number with the other complex number `c` provided
as parameter.

### Exercise 2

Create the class `Segment` representing line segments on a plane.
This class will have four fields of type `double`: the coordinates
of the two endpoints of the segment (`x1`, `y1`, `x2`, `y2`).

Create a method `line()` which returns a `Line` object representing
the line that covers the segment.

Create a method `contains(p)` which decides whether the point `p`
lies on the segment.

Create a method `orientation(p)` in class `Segment` which decides
whether the vector from the first endpoint of the segment to its
second endpoint and the given point `p` has orientation "clockwise"
(right turn), "counter-clockwise" (left turn) or "colinear" (no turn).
The method should return zero if the point is on the line covering the
segment (colinear), a positive number if the orientation is clockwise,
and a negative number if the orientation is counter-clockwise. This is
actually quite simple. If we denote the coordinates of `p` with $x_3$
and $y_3$, our method should evaluate the following expression.

$$(y_2 - y_1)(x_3 - x_2) - (y_3 - y_2)(x_2 - x_1)$$

Create a method `intersect(s)` which decides whether a segment intersects
with another segment `s` given as parameter. You can use the following
tutorial.

<http://www.dcs.gla.ac.uk/~pat/52233/slides/Geometry1x1.pdf>


### Exercise 3

Write the `SimplePolygon` program, which processes its command line arguments
in a similar manner to the program `Distance`, and which decides whether
the sequence of points given as command line arguments define a
*simple polygon*. Consequtive points in the sequence determine the
sides of the polygon. (The last side is defined by the last point and
the first point in the sequence.)

A sequence of points define a simple polygon, if the sides do not
intersect. Use the `Segment` class!

~~~
> java SimplePolygon 0.0 0.0 3.0 3.0 3.0 1.0 2.0 3.0
false
>
~~~

### Exercise 4

Change the `SimplePolygon` program in such a way that each point is represented
with a single command line argument of the form `x;y`, where `x` and `y`
are two numbers.

~~~
> java SimplePolygon 0.0;0.0 3.0;3.0 3.0;1.0 2.0;3.0
false
>
~~~

### Exercise 5

Create the `Convex` program, which takes its command line arguments as
the points of a polygon (similarly to the previous exercise), and
decides whether the polygon is convex. A simple polygon is convex if
consequtive sides are always in the same orientation (all clockwise
or all counter-clockwise) and never colinear.

