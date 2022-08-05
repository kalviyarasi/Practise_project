
package finalProject;

import java.io.File;
import java.util.Arrays;

public class DisplayFile {
	public void displayTheFile(String path) {
		File f=new File(path);
		File[] f1=f.listFiles();		
		int flag=0;
		for(File i:f1) {
			System.out.println(i.getName());
			flag=1;
			
		}
		System.out.println();
				
		if(flag==1) {
			System.out.println("These files found in the Directory");
		}
		else {
			System.out.println("Directory is empty");
		}
	}

}