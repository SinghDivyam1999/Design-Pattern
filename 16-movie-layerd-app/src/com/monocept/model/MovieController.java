package com.monocept.model;

import java.io.IOException;
import java.util.Scanner;

public class MovieController {

	public void start() throws IOException {
		System.out.println("Welcome to Movie App");
		displayMenu();
	}

	private void displayMenu() throws IOException {
		while (true) {
			MovieManager manager = new MovieManager();
			System.out.println("Number of Movies " + manager.getCount());
			System.out.println("Press 1 to Add Movie");
			System.out.println("Press 2 to Display");
			System.out.println("Press 3 to Clear ALL");
			System.out.println("Press 4 to EXIT");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter movie Names");
				String name = sc.next();

				System.out.println("Enter Movie Genre");
				String genre = sc.nextLine();

				System.out.println("Enter Movie Year");
				int year = sc.nextInt();

				System.out.println("Enter Movie id");
				int id = sc.nextInt();
				Movie movie = new Movie(name, genre, year, id);

				manager.addMovie(movie);
			}
			if (choice == 2) {
				System.out.println("diplay");
				System.out.println(manager);
				for (Movie obj : manager.getMovies()) {
					System.out.println("-------------------------");
					System.out.println("Name      " + obj.getName());
					System.out.println("Genre     " + obj.getGenre());
					System.out.println("Year       " + obj.getYear());
					System.out.println("ID       " + obj.getId());
					System.out.println("-------------------------");
				}
			}
			if (choice == 3)
				manager.clearMovie();

			if (choice == 4)
				break;
		}
	}
}
