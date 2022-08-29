package PastPaper_2016;
/*
 Read the file input.txt and copy it's content and stored in a variable then
 write that content in separate file output.txt
 Only using byte stream classes such as FileInputStream & FileOutputStream
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadCopyWrite {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\Fathir\\Desktop\\input.txt");
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Fathir\\Desktop\\output.txt");
			String s="";//to store the content that we are going to read
			int i;
			
			try {
				System.out.println("Reading the file.... ");
				while ((i=fin.read())!=-1) {
					//System.out.print((char)i);//read the file and print it in the console
					
					s+=(char)i;				
					}//storing read string in variable s
					//System.out.println(s);//print the value stored in variable s
				System.out.println("copying file content.... ");
				byte b[]=s.getBytes();//to write the code need to convert our string into byte
				fout.write(b);
				System.out.println("writing in to file.... ");
				fout.close();
				fin.close();	
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
