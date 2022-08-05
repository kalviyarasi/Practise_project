package finalProject;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	public void searchTheFile(String path) {
		
		DisplayFile df=new DisplayFile();
		df.displayTheFile(path);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please be aware that file name is case sensitive ");
		System.out.println("enter file name to search ");
		String filename=sc.next();
		String filepath=path+filename;

		File f1=new File(path);
		File[] files=f1.listFiles();
		
		int flag=0;
		for(File i:files) {
			if(i.getName().equals(filename)) {
				flag=1;
				break;
			}
			else
				flag=0;
		}
		
		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("File Not Found");
		}

		}

}
