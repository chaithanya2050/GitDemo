import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//connecting streams
		
		File f =new File("C:\\filewriting\\MyTextFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//read  text file
		String line = null;
		while((line = reader.readLine())!=null)
		{
			System.out.println(line);

		}
		
		
		
		//System.out.println(reader.readLine());
		//System.out.println(reader.readLine());
		
		reader.close();
	}

}
