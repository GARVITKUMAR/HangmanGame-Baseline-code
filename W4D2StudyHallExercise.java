package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise {
	/*@Author Sawan */

	private static String usersName;
	private static String inputFromUser;
	private static char menuCharacter;

	public static void main(String args[]) {
		System.out.println("Hungman Game");/* Initialize the Text Hangman game */
		Scanner keyboard = new Scanner(System.in); //scanner initialisation

		System.out.println("Welcome! \nkindly enter your name:");

		usersName= keyboard.next(); // reading user name


		while (true) { //starting first loop
			System.out.println(usersName+", please enter a command letter:  \np -> Play the game \ns -> View statistics \nq -> Quit");/* Display menu */

			 menuCharacter = keyboard.next().charAt(0); /* Read the menu character */
             // menuCharacter is already a char, but we can type as many characters in console(i don't know how to fix this), so it will take only first char.
		while(true){if(menuCharacter=='p'){ /* Play the game? */            // if conditions started with loop so it will be in loop as requirements
			System.out.println("Play the game command recognized. "+ usersName+", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
			menuCharacter = keyboard.next().charAt(0);

			while(true){if(menuCharacter=='p'){ /* Play the game? */
				System.out.println("Play the game command recognized. "+ usersName+", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
				menuCharacter = keyboard.next().charAt(0);
				}
		if(menuCharacter=='s'){/* View the statistics? */
			System.out.println("View the statistics command recognized."+ usersName+", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
			menuCharacter = keyboard.next().charAt(0);
			}
			if(menuCharacter=='q'){/* Quit the game? */
				System.out.println("Quit the game command recognized. Thanks for playing," + usersName+ "!");
			return; // return because the game will not run after quitting
			}
			if(menuCharacter!='q') if(menuCharacter!='p') if(menuCharacter!='s'){ // these statements are for any other char other than p,q or s
				System.out.println("*** Error *** \nInvalid menu item entered. It must be p, s, or q! \nThe input found was: "+menuCharacter +", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
				menuCharacter = keyboard.next().charAt(0);
			}
		}
			}
		if(menuCharacter=='s'){
				System.out.println("View the statistics command recognized."+ usersName+", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
				menuCharacter = keyboard.next().charAt(0);
				while(true){	if(menuCharacter=='p'){ /* Play the game? */
					System.out.println("Play the game command recognized. "+ usersName+", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
					menuCharacter = keyboard.next().charAt(0);
				}
				if(menuCharacter=='s'){/* View the statistics? */
					System.out.println("View the statistics command recognized."+ usersName+", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
					menuCharacter = keyboard.next().charAt(0);}
				if(menuCharacter=='q')
					{
					System.out.println("Quit the game command recognized. Thanks for playing," + usersName+ "!");
				return;
				}
				if(menuCharacter!='q') if(menuCharacter!='p') if(menuCharacter!='s'){/* Display error (if command is none of the above) */
					System.out.println("*** Error *** \nInvalid menu item entered. It must be p, s, or q! \nThe input found was: "+menuCharacter +", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
					menuCharacter = keyboard.next().charAt(0);
				}
				}
				}
			if(menuCharacter=='q'){/* Quit the game? */
			System.out.println("Quit the game command recognized. Thanks for playing," + usersName+ "!");
		return;
		}
		else{ /* Display error (if command is none of the above) */
			System.out.println("*** Error *** \nInvalid menu item entered. It must be p, s, or q! \nThe input found was: "+menuCharacter +", please enter a command letter followed by a return! \np -> Play the game \ns -> View statistics \nq -> Quit");
			menuCharacter = keyboard.next().charAt(0);

		}
			}
			}
		}
	}


