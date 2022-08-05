package finalProject;

import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	public static void main(String[] args) throws IOException{
		WelcomeScreen.printWelcomeScreen("Virtual Key Repository", "Kalviyarai M");
		Scanner sc=new Scanner(System.in);
		
		String path="C:\\Users\\Kalviyarasi\\Documents\\mphasisfinalpro\\";
				
		AddFile a=new AddFile();
		DisplayFile dis=new DisplayFile();
		DeleteFile del=new DeleteFile();
		SearchFile s=new SearchFile();
		
		label:while(true) {
			System.out.println("Enter your choice \n1.List the files \n2.Enter into sub switch case (1.add file. 2.Delete file. 3.Search file) \n3.Exit application ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:dis.displayTheFile(path);
			break;
			case 2:while(true) {
				System.out.println("enter your choice \n1.Add file \n2.Delete file \n3.Search file \n4.Exit subswitch case\n ");
				int choice1=sc.nextInt();
				switch(choice1){
				case 1:a.addToFile(path);
				break;
				case 2:del.deleteTheFile(path);
				break;
				case 3:s.searchTheFile(path);
				break;
				case 4:System.out.println("Returning to main menu");
					continue label;
				}
				
			}
			case 3:System.out.println("Closing the application...... ");
			System.out.println("Thank you");
				System.exit(0);
			break;
			default:System.out.println("invalid operation");
			}
		}
				
	}
}
