import javax.swing.*;
/**
   JukeBox program simulara las maquinas de toca disco de antes.
*/

public class JukeBox{

    public static void main(String[] args){
	JFrame frame = new JFrame("Java Juke Bos");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add( new JukeBoxControls() );

	frame.pack();
	frame.setVisible(true);
    }
}

   
