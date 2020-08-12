import javax.swing.JFrame;

/** Convertidor de grados Farenheit a grados Celsius.
    Componets utility are JTextField, JLabel
 */
public class Farenheit{

    public static void main(String[] args){
	JFrame frame = new JFrame("Farenheit Converter");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Here add our Panel that needed
	FarenheitPanel panel = new FarenheitPanel();
	frame.getContentPane().add( panel );
	frame.pack();
	frame.setVisible(true);
    }
}
