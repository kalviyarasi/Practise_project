package finalProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	public void deleteTheFile(String path) {
		
		DisplayFile df=new DisplayFile();
		df.displayTheFile(path);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please be aware that file name is case sensitive ");
		System.out.println("enter file name to delete ");
		String filename=sc.next();
		String filepath=path+filename;
		
		File f=new File(filepath);
		File f1=new File(path);
		int flag=0;
		File[] f2=f1.listFiles();
		
		try {
			for(int i=0;i<f2.length;i++) {
				if(f2[i].getName().equals(filename)) {
					if(f.delete()) {
						flag=1;
						break;
					}
				}
				else {
					flag=0;
					}			
			}
		}
		catch(Exception e) {
			System.out.println("Failed to delete file " + filename);
			System.out.println(e.getClass().getName());
		}
		
		if(flag==1) {
			System.out.println("file deleted successfully");	
		}
		else {
			System.out.println("No File Found");
		}	
		
	}
}
