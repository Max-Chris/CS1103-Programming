package com.maxwell.file.level1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilesRunner {
	static char [] letters;

	static int separation;

	static int count =0;
	public static String getLastWordUsingSubString(String input) {
	    return input.substring(input.lastIndexOf(" ") + 1);
	}
	public static String getfullstringusingSubString(String input) {
	    return input.substring(0);
	}
	public static byte[] getfullstringAsbyte(String input) throws UnsupportedEncodingException {
	    return input.getBytes(input);
	}
	public static char mostCommonCharacter(char[] crArr){
		//System.out.println("Item here " + values);
		ArrayList<Character> newInput = new ArrayList<Character>();

		char largestCharrCont=0;

		//ArrayList<Character> values = new ArrayList<Character>();
		/*for(int i =0; i < newInput.size(); i++ ) {
		//for(char i : crArr) 
			//letters[i] = values.toArray().toString().charAt(i);

			if(i == ' ') {
				separation++;
			}else {
				letters[i] = values.toArray().toString().charAt(i);
				}
			System.out.println("letters Item here " + letters[i]);

		}*/
		for(int i=0; i < letters.length; i++) {
			int currCount=0;
			//largestCharrCont = crArr[i];
			if(newInput.contains(largestCharrCont)) {
				currCount++;
				largestCharrCont = letters[currCount];
				}else {
					newInput.add(largestCharrCont);
				}
		}
		System.out.println("the new input is: " +newInput);
		return largestCharrCont;
		 
	}
	
	public static void main(String[] args) {
		ArrayList<Character> values =new ArrayList<Character>();
		ArrayList<Character> emptyvalues =new ArrayList<Character>();


		ArrayList<Character> mostComchr =new ArrayList<Character>();
		byte [] asByte;
		int st=0;
		ArrayList<String> words =new ArrayList<String>();
		ArrayList<Character> character =new ArrayList<Character>();
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
			readInput.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int totalChar =input.size();
		System.out.println(totalChar);
		for(String element : input) {
			element.concat(" ");
			
			words.add(element);
			
			
		}
		/*for(String i : words) {
			if(i == " ") {
				emptyvalues.add(i);
			}else {
				values.add(i);
			}
		}*/
		/*for (int i=0;i<words.size()-1;i++) {
			int totaWords = words.toString().length();
			st++;
		}*/

		String WordsCount = words.toString();
		System.out.println("the words" + WordsCount.trim().length());

		String lastWord = getLastWordUsingSubString(WordsCount);
		String fullLength = getfullstringusingSubString(WordsCount);
		
			int countWords = WordsCount.lastIndexOf('H');
			int countWords2 = WordsCount.lastIndexOf('n');

			System.out.println(countWords);
			System.out.println(countWords2);

			System.out.println("charater count is: " +countWords );
				//String chararr =Arrays.toString(countWords);
				
				/*for(int i=0; i < countWords.length; i++);
				{
					
					count++;
			}*/
			//trim().split("").length;
		
		try {
			asByte = getfullstringAsbyte(fullLength);
			System.out.println("This is the byte array of the strng"+ asByte);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println("The word count is" + " " + WordsCount.split(" ").length);
		for(int i=0; i < WordsCount.trim().split("").length; i++) {
			mostComchr.add(WordsCount.charAt(i)); 	
		}		
		Iterable<Character> iterate = new ArrayList<Character>();
		for(char i : mostComchr) {
			if(i == ' ') {
				emptyvalues.add(i);
			}else {
				values.add(i);
			}
		}
		int i =0;
		StringBuilder connectecString = new StringBuilder();
		for(; i < values.size();i++) {
			letters[i] = connectecString.append(values.get(i)).charAt(i);
		}
		char [] myIn = new char[letters.length];
		char largestCharater = mostCommonCharacter(letters);
		
		System.out.println("letters[i] is: "+ letters[i]);

		System.out.println("largestCharater: "+ largestCharater);

		System.out.println("Testing to know the length: " +myIn.length);
		System.out.println("this is the connection: " + connectecString.toString());
		int totalCharCount = values.size() - (emptyvalues.size()-2);
		System.out.println("The number of characters is : " + totalCharCount);

		System.out.println("The empty values inside are: " + (emptyvalues.size()));
		int wordCount = totalCharCount/emptyvalues.size();
		

		System.out.println("The totoal number of Words inside is: " + wordCount);
		//System.out.println(separation);

		//System.out.println("The words are" + words);
		//System.out.println("The string representation is" + st);
			// TODO Auto-generated catch block
		//int numChar =((CharSequence) input).length();
		//System.out.println(numChar);
		//IntStream intStream = WordsCount.chars();	
		/*Stream<Character> characterStream = ((CharSequence) intStream).chars()
				  .mapToObj(c -> (char) c);*/
		//System.out.println(intStream);
		//long amountOfword = input.stream().count();//filter(e-> !e.equals(",")&& !e.equals(" ")).forEach(e->System.out.println(e));//collect(Collector.toList())
		
		//System.out.println(amountOfword);
		//String s = input.stream().toString()
		}

	}
//src/com.maxwell.file.level1/FilesRunner.java/