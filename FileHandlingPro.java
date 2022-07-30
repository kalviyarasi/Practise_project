package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


public class FileHandlingPro {
public static void main(String[] args) throws FileNotFoundException, IOException {		
        String path="C:\\Users\\Kalviyarasi\\Documents\\FileHandlingPro.txt";
    	Scanner sc =new Scanner(System.in);
    	
    	
    	FileHandlingPro obj=new FileHandlingPro();
    	
    	while(true) {
    		System.out.println("Enter your choice");
            System.out.println("1.Write to file\n2.Read a File\n3.Append to the  file ");
            int choice=sc.nextInt();
    		switch(choice) {
    		
            case 1: obj.WriteToFile(path);
                    break;
            case 2:obj.ReadFile(path);
                   break;
            case 3:obj.AppendToFile(path);
                   break;
            default:System.out.println("This is invalid operation");
            System.exit(0);
            }
    		
    	}   	
       }
	
	public static void WriteToFile(String filepath) {
		Scanner sc =new Scanner(System.in);
		System.out.println("CAUTION >> Please understand it will overwrite the content of the file ");
        System.out.println("Type 'no' to exit");
        System.out.println("Do you want to proceed :type 'yes' ");
        String s1=sc.nextLine();
        if(s1.equals("no"))
         System.exit(0);

		System.out.println("Enter the data which you want to write on the file");
		String data=sc.nextLine();
	    
	    try {
	      // Step 1: Creates a Writer using FileWriter
	      FileWriter output = new FileWriter(filepath);
	      
	      // Step 2: Writes string to the file
	      output.write(data);
	      System.out.println("Written operation is completed.");

	      // Step 3: Closes the writer
	      output.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	 }
	
	public static void ReadFile(String filepath) {

	    char[] array = new char[500];
	    
	    try {
	      // Step 1: Creates a reader using the FileReader
	      FileReader input = new FileReader(filepath);

	      // Step 2: Reads characters
	      input.read(array);
	      
	      System.out.println("Data in the file:\n");
	      System.out.println(array);

	      // Step 3: Closes the reader
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
	

	public static  void AppendToFile(String filepath) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the data which you want to add on the existing  file");
		String data=sc.nextLine();
		OutputStream os = null;
		try {
			// below true flag tells OutputStream to append
			os = new FileOutputStream(new File(filepath), true);
			os.write(data.getBytes(), 0, data.length());

		      System.out.println("New data is appended to the file.");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
