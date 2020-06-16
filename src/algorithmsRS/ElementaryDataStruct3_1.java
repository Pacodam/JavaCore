package algorithmsRS;

import algorithmsRS.enums.Suit;
import algorithmsRS.model.PlayingCard;


public class ElementaryDataStruct3_1 {

    public static void main(String[] args){

       /* 3.1 Define a class suitable for representing playing cards, including methods
        for testing whether two cards are in the same suit and whether one has a higher
        value than the other. Also include a toString() method.*/


        PlayingCard a = new PlayingCard(Suit.CLUB, 3);
        PlayingCard b = new PlayingCard(Suit.CLUB, 4);
        PlayingCard c = new PlayingCard(Suit.HEART, 11);

        System.out.println(a.isBigger(b));
        System.out.println(b.isBigger(a));
        System.out.println(b.isSameSuit(c));
        System.out.println(b.isSameSuit(a));

       /* 3.2 Write a class that uses the Point class to implement a data type for
        triangles in the unit square. Include both a method for testing whether the
        triangle is a right triangle and a toString method for printing the coordinates
        of the vertices.*/

       /* 3.3 Write a client program that uses the data type in Program 3.2 for the
        following task: Read a sequence of points (pairs of floating-point numbers)
        from standard input, and find the one that is closest to the first.*/

       /*  3.4 Add a method to the point data type (Program 3.2) that determines
        whether or not three points are collinear, to within a numerical tolerance of
        10−4. Assume that the points are all in the unit square.*/

      /*  3.5 Give a NumberSeq implementation that allows you to use Program 3.3
        (modified to be a NumberSeq client, as described in the text) to print the average
        and standard deviation of a sequence of random 4-digit integers.*/

      /*  3.6 Add to your class from Exercise 3.2 a method for computing the area
        of the triangle. Then write a myNUMBER implementation that allows you to use
        Program 3.3 (modified as described in the text) to generate random triangles
        and compute their average area.*/

       /* 3.7 Test the random-number generator on your system by generating N
        random integers between 0 and r − 1 with ((int) (1000*Math.random()))
                % r and computing the average and standard deviation for r = 10, 100, and
        1000 and N = 103, 104, 105, and 106.*/

      /*  3.8 Test the random-number generator on your system by generating N
        random integers between 0 and r − 1 with ((int) (r*Math.random())) and
        computing the average and standard deviation for r = 10, 100, and 1000 and
                N = 103, 104, 105, and 106.*/

       /* 3.9 Do Exercises 3.7 and 3.8 for r = 2, 4, and 16.*/

     /*   3.10 Adapt Program 3.3 to be used for random bits (numbers that can take
        only the values 0 or 1).*/

      /*  3.11 Give an analytic expression for the expected distance to the origin
        of a random point in the unit square and compare with the result of using
        Program 3.3 (in the manner described in the text) to find the average and
        standard deviation of this quantity for N random points, for N = 103, 104,
                105, and 106.*/
    }
}
