//Derrick Conway G00328406
package ie.gmit.sw.client;

import java.io.*;
import java.util.Scanner;

public class FileServer {
	
		//create a file directory with arrays
	/**
	 * making directory to file and arrays
	 */
	 private static File directory = new File("src/ie/gmit/sw/server"); 
		private static File[] files = directory.listFiles();
		
	
		public FileServer(){
			new Thread(new Runnable(){
				public void run() { 
					try {
						
					} 
					
					catch (Exception e) { 
						System.out.println("Error " + e.getMessage());
					}
				}//close run
				
			}, "FileServer").start();
			
		}// close fileserver
		
		public static void listFiles(){
		
		    for (int i = 0; i < files.length; i++) {
			     
		      
		    }//close for
		    
		} //close list file
		
		public void downloadFile(){
			
			Scanner console = new Scanner(System.in);

			System.out.print("Enter file download: ");
			String files = console.next();
			
			
		} // end download file
}//close class
