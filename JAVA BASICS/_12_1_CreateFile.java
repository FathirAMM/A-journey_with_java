import java.io.File;
import java.io.IOException;

public class _12_1_CreateFile {	
	public static void main(String[] args) {
		File file1=new File("C:\\Users\\Fathir\\Desktop\\sample1.txt");
		try {
			file1.createNewFile();//Creates an empty file
			System.out.println("new file succesfully created");
			//Note that when run code again and again it willnot create many duplicate file
			
	    } catch (IOException e) {
	    	System.out.println("An occur occured");
			e.printStackTrace();			
			//can detect runtime error (example: file path does't exist)							
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
		File file2=new File("C:\\Users\\Fathir\\Desktop\\sample2.txt");
		try {
			if(file2.createNewFile()) {
				System.out.println("new file succesfully created......");
			}else {
				System.out.println("File already exist......");
			}
		} catch (IOException e) {
			System.out.println("An occur occured......");
			e.printStackTrace();
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Let's play with other methods of File class
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println(file1.exists());
		System.out.println(file1.getName());
		System.out.println(file1.getPath());
		System.out.println(file1.length());
		file1.delete();
		file2.delete();
		
	}

}


/*
* File operation in Java
*Create a file 
*Get file information
*Read a file
*Write to a file


***Create a file

Java.io package allows to do all Input and Output tasks in Java.
File is one of the inbuilt class in Java.io package
Inbuilt class "File" has inbuilt methods and inbuilt constructors

some important inbuilt methods of "File" class
**createNewFile() :Creates an empty file
**canRead()       :Tests whether file is readable or not(return T or F)
**canWrite()      :Tests whether file is writable or not(return T or F)
**delete()        :Deletes a file
**exists()        : Tests whether file exists or not
**getName()       :Returns the name of the file
**getPath()       : Returns the path name of the file
**length()        : Returns the size of the file in bytes
**mkdir()         :Creates a directory


when specifying file path we use "\\" instead of "\" ,why?
we are telling to Java that consider "\" as a special character
"\\" means consider it as single character"\"
"\t" means consider it as single character"		" :1 tab space
"\n" means print text following "\n", into next line

 */

