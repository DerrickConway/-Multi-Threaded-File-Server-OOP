//Derrick Conway G00328406
package ie.gmit.sw.client;

import java.io.*;
import java.util.Scanner;

public class FileServer {

	 private static File directory = new File("src/ie/gmit/sw/server"); 
		private static File[] files = directory.listFiles();
		
	
		public FileServer(){
			new Thread(new Runnable(){
				public void run() { 
					try {
						
					} catch (Exception e) { 
						System.out.println("Error " + e.getMessage());
					}
				}
				
			}, "FileServer").start();
			
		}
		
		public static void listDownloadableFiles(){
		
		    for (int i = 0; i < files.length; i++) {
			      
		    	if (files[i].isFile()) // if item is a file, do this
		    		System.out.println("File Name	" + files[i].getName());
		      
		    	else if (files[i].isDirectory())
		    		System.out.println("Directory Name	" + files[i].getName());
		    }
		    
		} 
		
		public void downloadFile(){
			
			Scanner console = new Scanner(System.in);

			System.out.print("Enter file name to download: ");
			String file = console.next();
			
			
		} // End downloadFile()
}
