import javax.swing.JFrame;//JFrame is a class of javax.swing package 

public class JFrameDemo {

	public static void main(String[] args) {
		
		//create GUI window
		JFrame frame=new JFrame("<<<<<<===========GUI===========>>>>>>");//parameter is display title of the window 
		frame.setBounds(350,50,700,600);//(x-coordinate in the PC screen,y-coordinate in the PC screen,width,height)
		//frame.setSize(700,600);//only pass width and height
		frame.setVisible(true);//make form visible
		frame.setResizable(false);//Don't allow to maximize the window
		//frame.setTitle("<<<<<<===========GUI===========>>>>>>");//Display title of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//if we don't put this line....
		//...JFrame will close fine when click close button, but application will continue to run
		//You can verify that by seeing terminate button still red in console
		frame.setLayout(null);
	}

}
/*
awt(abstract window toolkit) and swing are two main packages used to develop GUI application
swing is good compared to awt
awt is platform dependent and and swing is platform independent
execution time ...awt>swing
Thats why swing is best

*/