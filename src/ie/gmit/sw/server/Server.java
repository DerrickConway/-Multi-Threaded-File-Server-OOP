package ie.gmit.sw.server;

import java.io.*;
import java.net.*;


public class Server {

	private ServerSocket serverSock; 
	private static final int PORT = 7777;  
	private volatile boolean keepRunning = true;
	
	public Server()
	{
		try 
		{ 
			serverSock = new ServerSocket(PORT);
			Thread serverThread = new Thread(new Listing(), "Server Listing");
			serverThread.setPriority(Thread.MAX_PRIORITY); 
			serverThread.start();
			
			System.out.println("Server is listening" + PORT);
			
		} catch (IOException e) 
		{
			System.out.println("Error " + e.getMessage());
		}
	} // end private Server method
	
	
	
	public static void main(String[] args) {
		System.out.println("well done Server is running");
	}
	
	private class Listing implements Runnable { 
		
		public void run() { 
			
			int count = 0; 
			
			while (keepRunning){ 
				try { 
					Socket socket = serverSock.accept();
					//new Thread(new HTTPRequest(socket), "T-" + count).start(); 
					count++; 
				} catch (IOException e) { 
					System.out.println("Error - " + e.getMessage());
				}
			} 
			
		} 
		
	}
	
	private class HTTPRequest implements Runnable{
		//private Socket sock; 

		private HTTPRequest(Socket request) { 
			
		}

		public void run() { 
         
        } 
		
	} 
	
}
