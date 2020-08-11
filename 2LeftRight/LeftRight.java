import javax.swing.JFrame;

/** Example in which one listener objects is used to listen two diferent components */

public class LeftRight{    
    public static void main(String[] args){
	JFrame frame = new JFrame("Left and Right");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add( new LeftRightPanel() );
	
	frame.pack();
	frame.setVisible(true);
    }
}
