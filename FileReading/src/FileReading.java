import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReading {

	static void displayEmployees(ArrayList<String> employees) {
		for(String employee : employees) {
			System.out.println(employee);
		}
		
		
	}
	
	static void readFile(ArrayList<String> employees) {
		
		File path = new File("C:\\JavaProgramming\\employee.txt");
		String lines = "";
		try {
		FileReader file = new FileReader(path);

		BufferedReader fileInput = null;
		fileInput = new BufferedReader(file);
		try {
			lines = fileInput.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(lines != null) {
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
		
			
		}catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList();
		readFile(employees);// At this point employees was transformed with new values inside of it
							//the transformation remained such that when displayEmployees() was called it came with
							//the transformed employees arraylist
		displayEmployees(employees);
		
		
	}

}
