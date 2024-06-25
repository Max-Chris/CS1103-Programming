package com.maxwell.file.level1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class FilesRunner {

	public static void main(String[] args) {
		List<String> input = new ArrayList();
		// TODO Auto-generated method stub
		System.out.println("Type the name of the file with extension enter end to close");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		try {
			Scanner readInput = new Scanner(Paths.get(fileName));
			
			while(readInput.hasNext()) {
				String line = readInput.nextLine(); //scanner.nextLine();
				//System.out.println(line);
				
					input.add(line);
				//System.out.println(input);

				
				//if(line.equalsIgnoreCase("end")) {
					//break;
				//}
					//readInput.close();
					
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			// TODO Auto-generated catch block
		//int numChar =((CharSequence) input).length();
		//System.out.println(numChar);
		input.stream().filter(e-> !e.equals("end")).forEach(e->System.out.println(e));//collect(Collector.toList())
		
		//System.out.println(input);
		//String s = input.stream().toString()
		}

	}
//src/com.maxwell.file.level1/FilesRunner.java/