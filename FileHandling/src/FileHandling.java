import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {
	
	public static void writeFile(ArrayList<String> employees) {
		Path path = Paths.get("C:\\JavaProgramming\\user.txt");
		BufferedWriter bw = null;
		Charset  myCharset = Charset.forName("ISO-8859-1");
		try {
			bw = Files.newBufferedWriter(path, myCharset, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String employee : employees) {
			try {
				bw.write(employee);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		
	}
	
	
	static void displayEmployee(ArrayList<String> employees) {
		
		for(String employee : employees) {
			System.out.println(employee);
		}
		
	}
	static void readFile(ArrayList<String> employees) {
		BufferedReader fileInput = null;
		
		String lines ="";
		Path path = Paths.get("C:\\JavaProgramming\\employee.txt");

		
		Charset  myCharset = Charset.forName("ISO-8859-1");
						
			try {
				fileInput = Files.newBufferedReader(path, myCharset);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				lines = fileInput.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(lines !=null) {
				employees.add(lines);
				try {
					lines = fileInput.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList();
		readFile(employees);// At this point employees was transformed with new values inside of it
							//the transformation remained such that when displayEmployees() was called it came with
							//the transformed employees arraylist
		displayEmployee(employees);
		writeFile(employees);
	}

}
