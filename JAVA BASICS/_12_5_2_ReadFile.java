import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _12_5_2_ReadFile {

	public static void main(String[] args) {
		File file2=new File("C:\\Users\\Fathir\\Desktop\\sample6.txt");
		try {
			if(file2.createNewFile()) {//create new file
				FileWriter mywriter1 =new FileWriter(file2);
				mywriter1.write("Hello guys welcome!\n");//write in file
				mywriter1.write("Hello welcome!\n");//write in file
				mywriter1.write("Hello !");//write in file
				mywriter1.close();
			}else {
				System.out.println();	
			}
			////////////////
			Scanner myReader = new Scanner(file2);
			while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data+"\n");

			}
		} catch (IOException e) {
			System.out.println("An occur occured......");
			e.printStackTrace();
		}

	}

}
