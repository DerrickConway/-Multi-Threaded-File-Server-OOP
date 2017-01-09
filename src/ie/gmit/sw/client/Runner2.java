package ie.gmit.sw.client;
//
import java.util.Scanner;

import ie.gmit.sw.client.conf.Parsetor;
import ie.gmit.sw.client.conf.XMLParser;
import ie.gmit.sw.server.Server;

public class Runner2 {
static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws Throwable {
		
		Parsetor p = new Parsetor();
		XMLParser xmlp = new XMLParser(p);
		xmlp.parse();
		
		System.out.println(p);
		
		Interface u = new Interface();
		RunnerConnection c = new RunnerConnection();
		FileServer files = new FileServer();

		u.menu(); 
		/**
		 * while loop for menu
		 */
		//while loop
		while(u.pick != 4){
			//select between 1-4 n menu
			System.out.println("\nSelect option [1 - 4]");
			u.pick = console.nextInt();
			
			// user pick 1 it connect to serever
			if(u.pick == 1)
			{
				Server server = new Server();
				c.Connection();
			}
			
				//if user picks a wrong number gwtes user to pick again
				else 
				{ 
					System.out.println("Select option [1 - 4]");
					u.pick = console.nextInt(); 
				}
			
		}
	}
}
