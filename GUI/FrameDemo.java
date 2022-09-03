import javax.swing.JFrame;

class FrameClass extends JFrame {

	//Create GUI window using a class
	//Here we are creating child class for inbuilt parent JFrame
	FrameClass(){
		super("Frame demo");
		//setSize(300,300);//not mandatory to create object
		setBounds(350,50,700,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class FrameDemo {

	public static void main(String[] args) {
		//FrameClass o=new FrameClass();
		new FrameClass();//short cut
		
		

	}

}
