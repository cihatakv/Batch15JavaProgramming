package day43;

import day42.Movie;
import day44.Vehicle;

public class MovieActions {

    public static void main(String[] args) {
        Movie m1 = new Movie("Joker", 2.5, "Drama");

        printMovieInfoInformation(m1);

        System.out.println("\n" + (new Movie("Joker", 2.5, "Drama")).getName());

        Vehicle v1 = new Vehicle();

    }


    /**
     * A void method that accept any movie object
     * and print out it's information in below format
     * The movie <name> is <length> hour long and i genre is <type>
     *
     * @param movieObj the movie object to get information from
     */
    public static void printMovieInfoInformation(Movie movieObj) {
        // TODO YOUR CODE HERE

        System.out.print("The movie name " + movieObj.getName());
        System.out.print(" is " + movieObj.getLength() + " hour long ");
        System.out.print(" and it genre is " + movieObj.getType());

    }

}
