import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _12_5_ReadFile {

	public static void main(String[] args) {
		File file2=new File("C:\\Users\\Fathir\\Desktop\\sample6.txt");
		try {
			if(file2.createNewFile()) {//create new file
				FileWriter mywriter1 =new FileWriter(file2);
				mywriter1.write("Hello guys welcome!");//write in file
				mywriter1.close();
			}else {
				System.out.println();	
			}
			FileReader myReader=new FileReader(file2);
			int i;
			while((i=myReader.read())!=-1) {
			System.out.print((char)i);//read file
			}
			myReader.close();
			
		} catch (IOException e) {
			System.out.println("An occur occured......");
			e.printStackTrace();
		}
	}

}
