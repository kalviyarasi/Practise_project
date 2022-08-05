package finalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	
	public void addToFile(String path) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter filename to add ");
		String filename=sc.nextLine();
		String filepath=path+filename;
		File f=new File(filepath);
		
		try {
			if(f.createNewFile()) {
				System.out.println("file is created successfully");
				System.out.println("Do you want to add any data in your file? yes/no ");
				String choice=sc.next();
				sc.nextLine();
				if(choice.equals("yes")) {
					System.out.println("enter your data ");
					String data=sc.nextLine();
					FileWriter fw =new FileWriter(f);
					fw.write(data);
					System.out.println("your content is written in the created document ");
					fw.close();
				}
			}
			else {
				System.out.println("file is already present");
			}
		}
		catch(Exception e) {
			System.out.println("Failed to create file " + filename);
			//System.out.println(e.getClass().getName());
			//e.printStackTrace();
		}

		
	}

}
