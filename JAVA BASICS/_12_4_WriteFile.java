import java.io.File;
import java.io.FileWriter;//character stream to write in a file
import java.io.IOException;

//FileInputStream(byte wise),FileReader(character wise) classes to read a file
//FileOutputStream(byte wise),FileWriter(character wise) classes to write in a file
public class _12_4_WriteFile {
	
	public static void main(String[] args) {
		File myfile=new File("C:\\Users\\Fathir\\Desktop\\sample4.txt");
		
		try {
			myfile.createNewFile();//create a new file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//before write we have to create a file
		 //we can write, if there is already a file exist
		/////////////////////////////////////////////////////////////////
		
		try {
			FileWriter mywriter =new FileWriter(myfile);//parameter is object name
			mywriter.write("Hello guys !");
			mywriter.write("Hello !");
			mywriter.close();//after write need to close the file
			//note that when we run code again and again it willnot create duplicate lines inside the file
		} catch (IOException e) {
			
			e.printStackTrace();
		}
/////////////////////////////////////////////////////////////////////////////////////////
	
		
		
		//example 2
		
		
		
		
		File file2=new File("C:\\Users\\Fathir\\Desktop\\sample5.txt");
		try {
			if(file2.createNewFile()) {
				FileWriter mywriter1 =new FileWriter(file2);
				mywriter1.write("Hello guys welcome!");
				mywriter1.close();//after write need to close the file
				//once write in to the file, it will not allow to write again when rerun the code
				//since if condition become false
			}else {
				System.out.println("Duplicate file......");	
			}
			
		} catch (IOException e) {
			System.out.println("An occur occured......");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}


/*
Before learn how to read and write in a file, we have to know about streams
*****Streams
•A stream can be defined as a sequence of data. 
•There are two kinds of streams.
• Input stream : used to read data from a source.
• Output stream: used for writing data to a destination.

Types of Streams based on its working pattern
*Byte Stream
*Character stream

Byte Stream
• Java byte streams are used to perform input and output of 8-bit bytes. 
• Though there are many classes related to byte streams but the most 
frequently used classes are,

➢ FileInputStream
➢ FileOutputStream
FileInputStream, FileOutputStream are classes based on byte stream

===========

Character Stream
• Java Character streams are used to perform input and output for 16-bit unicode. 
• Though there are many classes related to character streams but the most 
frequently used classes are,

➢ FileReader
➢ FileWriter

FileReader,FileWriter are classes based on Character stream
• Though internally FileReader uses FileInputStream and FileWriter uses 
FileOutputStream but here the major difference is that FileReader reads 
two bytes at a time and FileWriter writes two bytes at a time.





*/