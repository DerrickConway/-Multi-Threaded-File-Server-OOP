//Derrick Conway G00328406
package ie.gmit.sw.client;

import java.net.Socket;

public class RunnerConnection {
	
private static Socket s;
	
	public void openConnection() {
		try {
			s = new Socket("localhost", 7777);
			
			System.out.println("well done your connected");
			
			//s.close();
			
		} catch (Exception e) { 
			System.out.println("Error - " + e.getMessage());
		}
	}
	
	public static void closeConnection() throws Exception{
		s.close();
		System.out.println("connection closed.");
	}
}
