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
		xmlp.parse();
		
		System.out.println(p);
		
		Interface u = new Interface();
		RunnerConnection c = new RunnerConnection();
		FileServer file = new FileServer();

		u.menu(); 
		//while loop
		while(u.pick != 4){
			//select between 1-4 n menu
			System.out.println("\nSelect option [1 - 4]");
			u.pick = console.nextInt();
			
			// user pick 1 it connect to serever
			if(u.pick == 1){
				Server server = new Server();
				c.Connection();
			} 
			
			// if user picks 2 files available for download
			else if(u.pick == 2){
				System.out.println("Files Available for Download:");				
				FileServer.listDownloadableFiles();
				
			} 
			
			//if picks 3 shows download files
			else if(u.pick == 3){
				
				
			}
			
			//if user pick 4 it quits the program
			else if(u.pick == 4) {
				RunnerConnection.closeConnection(); // exit
				System.out.println("exit");
			} 
			
			//if user picks a wrong number gwtes user to pick again
			else { 
				System.out.println("Select option [1 - 4]");
				u.pick = console.nextInt(); 
			}
			
		} // End while
		
	} // End run()
	
}
