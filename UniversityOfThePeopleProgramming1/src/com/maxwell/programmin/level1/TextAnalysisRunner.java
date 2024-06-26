package com.maxwell.programmin.level1;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TextAnalysisRunner {
	
	static int firstIndex;
	static int lastIndex;

	static String WordsCount;
	
	public static String getTotalChar(String input) {
	    return input.substring(0);
	}
	
	public static int firstPosition(String str) {
		return str.indexOf(firstIndex);
		
	}
	public static int lastPosition(String str) {
		return str.lastIndexOf(lastIndex);
		
	}
			
			public static void main(String[] args) {
				
				List<String> input1;

				TotalWords totalWords = new TotalWords();
				ArrayList<String> words =new ArrayList<String>();
				

				ArrayList<Character> character =new ArrayList<Character>();
				List<String> input11 = new ArrayList();
				// TODO Auto-generated method stub
				
				System.out.println("Type the name of the file with extension enter end to close");
				Scanner scanner = new Scanner(System.in);
				String fileName = scanner.nextLine();
				try {
					Scanner readInput = new Scanner(Paths.get(fileName));
					
					while(readInput.hasNext()) {
						String line = readInput.nextLine(); //scanner.nextLine();
						//System.out.println(line);
						
						input11.add(line);
						//System.out.println(input);

						
						//if(line.equalsIgnoreCase("end")) {
							//break;
						//}
							//readInput.close();
							//toString();
					}
					readInput.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				input11.stream().filter(e-> !e.equals("end")).forEach(e->System.out.println(e));//collect(Collector.toList())
				WordsCount = input11.toString();

				String wordlength = getTotalChar(WordsCount);
				System.out.println(wordlength);
				input1 = List.of(wordlength);
				System.out.println("word count is: "  + wordlength.indexOf('I'));
				System.out.println("new  count is: "  + input1);

				firstIndex = firstPosition("a");
				System.out.println(firstIndex);
				lastIndex = lastPosition(".");
				System.out.println(lastIndex);


			}
}
				