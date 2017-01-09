package ie.gmit.sw.server;

import java.io.*;
import java.net.*;


public class Server {

	private ServerSocket serverSocket; 
	private static final int PORT = 7777;  
	private volatile boolean Running = true;
	
	
	public Server()
	{
		
		try 
		{ 
			serverSocket = new ServerSocket(PORT);
			Thread serverThread = new Thread(new Listing(), "Server Listing");
			serverThread.setPriority(Thread.MAX_PRIORITY); 
			serverThread.start();
			
			System.out.println("Server listening" + PORT);
			
		} 
		
		catch (IOException e) 
		{
			
			System.out.println("Error " + e.getMessage());
		}
	
	} //end server
	
	
	
	public static void main(String[] args) {
		System.out.println("well done Server is running");
	}
	
	private class Listing implements Runnable { 
		
		public void run() { 
			
			int count = 0; 
			
			while (Running){ 
				try { 
					Socket socket = serverSocket.accept();
					count++; 
				} catch (IOException e) { 
					System.out.println("Error - " + e.getMessage());
				}
			} 
			
		} //end of run
		
	}//end listing
	
	private class HTTPRequest implements Runnable{
		/**
		 * trying to make HTTP
		 * @param request
		 */

		private HTTPRequest(Socket request) { 
			
		}

		public void run() { 
         
        } 
		
	} //end of http
	
}//end class
