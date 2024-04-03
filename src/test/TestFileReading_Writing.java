package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReading_Writing {

	public static void main(String[] args) throws IOException {
		
		//create file
		
		File file=new File("C:\\screenshot\\test.txt");
		file.createNewFile();
		
		//write inside a file
		
		FileWriter fw=new FileWriter("C:\\screenshot\\test.txt");
		BufferedWriter fwriter=new BufferedWriter(fw);
		
		 fwriter.write("please write inside this file");
		 
		 fwriter.newLine();
		 fwriter.write("this is my second line");
		 fwriter.flush();
		
		 //read from a file
		 
		 FileReader fr=new FileReader("C:\\screenshot\\test.txt");
		 BufferedReader freader= new BufferedReader(fr);
		 String i="";
		 
		/* System.out.println(freader.readLine());
		 System.out.println(freader.readLine());
		 System.out.println(freader.readLine());
		 System.out.println(freader.readLine());
		 
		 */
		 
		 while((i=freader.readLine())!=null)
		 {
			 System.out.println(i);
		 }
	}

}
