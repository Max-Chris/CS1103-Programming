package com.maxwell.programmin1.textanalysistool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TextAnalysisToolRunner {

	
public static void main(String [] args){
			Scanner scanner =new Scanner(System.in);
			/*
			public class FileInputStream 
			extends InputStream
			
			A FileInputStream obtains input bytes from a file in a file system.
			What files are available depends on the host environment.
			
			FileInputStream is meant for reading streams of raw bytes such as 
			image data. For reading streams of characters, consider using 
			FileReader.
			*/
			
			FileInputStream fis;
			InputStreamReader isr;
			BufferedReader br; // This would ask isr or InputStreamReader for 
								//individual while isr of FileInputStream
								// would ask the source file for individual
								// byte
		// In order to bring fis to life, you have to pass in the name of a file
		
		
		/*
		An InputStreamReader is a bridge from byte streams to character streams:
		It reads bytes and decodes them into characters using a specified 
		charset. The charset that it uses may be specified by name or may be 
		given explicitly, or the platform's default charset may be accepted.
		Each invocation of one of an InputStreamReader's read() methods may 
		cause one or more bytes to be read from the underlying byte-input 
		stream. To enable the efficient conversion of bytes to characters, 
		more bytes may be read ahead from the underlying stream than are 
		necessary to satisfy the current read operation.
		
		For top efficiency, consider wrapping an InputStreamReader within a 
		BufferedReader. For example:
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
		
		*/
			try{
				System.out.println("Enter your name");
				File sb =new File(scanner.nextLine());
				fis = new FileInputStream(sb); // Assuming we don't have a text file readily available
											// but we have a source code in the same current directory
				isr = new InputStreamReader(fis);
				br = new BufferedReader(isr);
				// By using this layered translation approach as above we can read a 
				// wide variety of data types
				String readline = br.readLine();
				// the value of readline is going to be the: import java.io.*
				while(readline != null){
					System.out.println(readline);
					readline = br.readLine();// here read gets updated with the
											// next line from that file
				}
				br.close();
			}
			
			catch(FileNotFoundException e){
				System.out.println(e.getMessage());
			}
			catch(IOException f){
				System.out.println(f.getMessage());
			}
			
		}

	}
