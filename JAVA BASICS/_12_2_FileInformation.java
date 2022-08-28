import java.io.File;
import java.io.IOException;

public class _12_2_FileInformation {

	public static void main(String[] args) {
		File myfile=new File("C:\\Users\\Fathir\\Desktop\\sample3.txt");
		try {
			myfile.createNewFile();//create a new file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/////////////////////////////////////////////////////////////////
		//myfile.delete();
		if(myfile.exists()) {
			System.out.println("File name: " + myfile.getName());
			System.out.println("File absolute path: " + myfile.getAbsolutePath());
			System.out.println("File path: " + myfile.getPath());
			System.out.println("Writable: " + myfile.canWrite());
			System.out.println("Readable: " + myfile.canRead());
			System.out.println("File size in bytes: " + myfile.length());
		} else {
			System.out.println("The file does not exist");
			}
		//why we are not using try except block here?
		//because exists method does not have any exception
		//if we create try catch block it will create error
	
	
	}

}
