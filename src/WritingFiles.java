import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Stream Connectivity
//		File f =new File("C:\\filewriting\\MyTextFile.txt");
//		FileWriter fw=new FileWriter(f,true);
//		BufferedWriter writer = new BufferedWriter(fw);
//		
//		//Writing inside the file
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				writer.write(j+"\t");
//			}
//		}

		
		File f =new File("C:\\filewriting\\MyTextFil.html");
		FileWriter fw=new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//Writing inside the file
		/*for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				int num=(int) (Math.random()*100);
				writer.write(num+",");
			}
		}*/
		writer.write("<html> <body><title>Automation</tile><h1>learning java from>/h1></body></html>");
		
		/*writer.newLine();
		writer.write("second line");
		writer.newLine();
		writer.write("UK");
		writer.newLine();
		writer.write("Way2Automation");
		writer.newLine();
		writer.write("Chaithu");
		*/
		//Closing Stream
		
		writer.close();
		System.out.println("File Created !!!");
		
		
	}

}
