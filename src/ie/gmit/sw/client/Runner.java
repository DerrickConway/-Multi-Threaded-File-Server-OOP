//Derrick Conway G00328406
package ie.gmit.sw.client;

import java.util.Scanner;

import ie.gmit.sw.client.conf.*;
import ie.gmit.sw.server.Server;

public class Runner {

static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws Throwable {
		
		Parsetor p = new Parsetor();
		XMLParser xmlp = new XMLParser(p);
		xmlp.init();
		
		System.out.println(p);
		
		Interface u = new Interface();
		RunnerConnection c = new RunnerConnection();
		FileServer file = new FileServer();

		u.menu(); 
		
		while(u.pick != 4){
			
			System.out.println("\nSelect option [1 - 4]");
			u.pick = console.nextInt();
			
			if(u.pick == 1){
				Server server = new Server();
				c.openConnection();
			} 
			else if(u.pick == 2){
				System.out.println("Files Available for Download:");				
				FileServer.listDownloadableFiles();
				
			} 
			else if(u.pick == 3){
				
				
			}
			else if(u.pick == 4) {
				RunnerConnection.closeConnection(); // exit
				System.out.println("exit");
			} 
			else { // just in case user tries an invalid option
				System.out.println("Select option [1 - 4]");
				u.pick = console.nextInt(); //user to enter option again
			}
			
		} // End while
		
	} // End run()
	
}
