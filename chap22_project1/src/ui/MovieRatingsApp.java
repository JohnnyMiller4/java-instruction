package ui;

import java.time.LocalDate;

import java.util.List;

import business.Movie;
import db.MovieCollection;
import util.Console;

public class MovieRatingsApp {

	/*
	 * This app depends on the classes Movie and MovieCollection,
	 * which you have to write.  This main method gives you 
	 * some sample movies to use to add to your collection.
	 * Feel free to add some of your favorites to this list!
	 * Sean Blessing - May 2019
	 */
	public static void main(String[] args) {
		//initialize stuff
		MovieCollection mc = new MovieCollection();
		mc.add(new Movie("Avengers Infinity War", 2018, 4.0));
		mc.add(new Movie("Star Wars Episode V - Empire Strikes Back", 1980, 5.0));
		mc.add(new Movie("Sixteen Candles", 1984, 4.5));
		mc.add(new Movie("Happy Gilmore", 1996, 4.3));
		mc.add(new Movie("The Jerk", 1979, 3.9));
		mc.add(new Movie("Superbad", 2007, 3.9));
		mc.add(new Movie("Back to the Future Part III", 1990, 2.1));
		mc.add(new Movie("Entourage", 2015, 1.5));
		
		System.out.println("Welcome to the Movie Ratings application!");
		int option = 0;
		
		
		
		while (option!=6) {
			displayMenu();
		
			option = Console.getInt("Choose a menu option:  ", 0, 10);
		
			List<Movie> filteredMovies;
			switch (option) {
				case 1:		// Enter a movie
					int n = Console.getInt("\nHow many movies do you want to add?: ");
					for (int i=0; i<n; i++) {
						String title = Console.getString("\nTitle: ");
						int year = Console.getInt("Year: ");
						double rating = Console.getDouble("Rating: ");
						
						Movie m = new Movie(title, year, rating);
						mc.add(m);
					}
					
					break;
				case 2:		// View top rated movies
					System.out.println("\nTop Rated Movies:");
					System.out.println("----------------------");
					filteredMovies = mc.filterMovies(m -> m.getRating() >= 4.0);
					printMoviesToConsole(filteredMovies);
					
					break;
				case 3:		// View most recent movies (movies released within last 10 years)
					System.out.println("\nMost Recent Movies:");
					System.out.println("----------------------");
					int tenYearsAgo = LocalDate.now().getYear() - 10;
					filteredMovies = mc.filterMovies(m -> m.getYear() >= tenYearsAgo);
					printMoviesToConsole(filteredMovies);
					
					break;
				case 4: //view all movies
					System.out.println("\nAll Movies:");
					System.out.println("----------------------");
					printMoviesToConsole(mc.getMovieList());
					
					break;
				case 5:		// View ratings
					System.out.println("\nMovie Rating Data:");
					System.out.println("----------------------");
					System.out.println("Number of movies: " + mc.getSize());
					System.out.println("Lowest rating: " + mc.getLowestRating());
					System.out.println("Highest rating: " + mc.getHighestRating());
					System.out.println("Average rating: " + mc.getAverageRating());
					
					break;
				case 6:
					Console.println("\nGoodbye!");
					break;
				default:
					System.out.println("Error");
				break;
			}
		
		}
	}

	private static void printMoviesToConsole(List<Movie> filteredMovies) {
		filteredMovies.stream().forEach(m -> System.out.println(m));
	}

	public static void displayMenu() {
        Console.println("\n-----------------------");
        Console.println("What do you want to do?");
        Console.println("-----------------------");
        Console.println("1 - Enter a movie");
        Console.println("2 - View top rated movies");
        Console.println("3 - View most recent movies");
        Console.println("4 - View all movies");
        Console.println("5 - View ratings");
        Console.println("6 - Quit application");
        
        Console.println("");
	}
	
}
