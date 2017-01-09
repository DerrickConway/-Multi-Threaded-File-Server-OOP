//Derrick Conway G00328406
package ie.gmit.sw.client;

import java.util.Scanner;

public class Interface {
	Scanner console = new Scanner(System.in);
	public int pick;

	public Interface(){
		//System.out.println("----------MENU---------------");
	}
	
	//getter and setter for pick
/*=======================================================================================	*/
	public void setChoice(int pick) {
		this.pick = pick;
	}
	public int getChoice() {
		return pick;
	}
/*=======================================================================================	*/
	//user picks from menu
	public void menu() {
		System.out.println("----------MENU---------------");
		System.out.println("\n1- Connect to Server");
		System.out.println("2- Print File Listing");
		System.out.println("3- Download File");
		System.out.println("4- Quit");
		System.out.println("-----------------------------");
	}

	//whatever has been selected in menu
	public int option(){
		pick = console.nextInt();
		return pick;
	}//end option
	
}//end class
