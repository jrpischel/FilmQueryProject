package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) throws SQLException {
		FilmQueryApp app = new FilmQueryApp();
//    app.test();
		app.launch();
	}

//	private void test() throws SQLException {
//		Film film = db.findFilmById(1);
//    Actor actor = db.findActorById(1);
//    List<Actor> actors = db.findActorsByFilmId(1);
//    List<Film> film2 = db.findFilmByKeyWord("sdfghj");
//		System.out.println(film);
//	}

	private void launch() {
		Scanner input = new Scanner(System.in);

		startUserInterface(input);

		input.close();
	}

	private void startUserInterface(Scanner input) {
		int choice = 0;
		do {
			mainMenu();
			choice = input.nextInt();
			input.nextLine();
			switch (choice) {
			case 1:
				System.out.println("What is the ID of the Film you would like to find?");
				int filmId = input.nextInt();
				input.nextLine();
				Film filmById = db.findFilmById(filmId);
				if (filmById == null) {
					System.out.println("There was no film in the data-base that matched that ID, please try again");
				} else {
					System.out.println(filmById);
				}
				break;
			case 2:
				System.out.println("What is the Key Word of the Film(s) you would like to find?");
				String keyWord = input.next();
				List<Film> filmByKeyWord = db.findFilmByKeyWord(keyWord);
				if (filmByKeyWord.isEmpty()) {
					System.out.println("There was no film in the data-base that matched that key word, please try again");
				} else {
					System.out.println(filmByKeyWord);
				}
				break;
			case 3:
				System.out.println("Thank you for using the SD Video Library!");
				break;
				default:
					System.out.println("Invalid selection, please try again");
			}
		} while (choice != 3);

	}

	private void mainMenu() {

		System.out.println("***********************************");
		System.out.println("* Welcome to the SD Video Library *");
		System.out.println("*    choose from the menu below   *");
		System.out.println("*                                 *");
		System.out.println("* 1. Look Up Film By ID           *");
		System.out.println("* 2. Look up Film By KeyWord      *");
		System.out.println("* 3. Exit Application             *");
		System.out.println("*                                 *");
		System.out.println("***********************************");

	}

}
