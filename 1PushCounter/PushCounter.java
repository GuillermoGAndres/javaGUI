
import javax.swing.JFrame;

/** 
Creamos el uso de Frame, 
Frame es hightwight container, es decir su contenedor es manejando del subyaciente Sistema operativo que tengas,
para ser mostrada con su  windows managment que maneje.
**/

public class PushCounter{

    public static void main(String[] args){
	
	JFrame frame = new JFrame("Push Counter"); //Representara title bar
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	PushCounterPanel panel = new PushCounterPanel();
	frame.getContentPane().add(panel); 
	
	frame.pack(); //Reajusta con el tamaño del panel 
	frame.setVisible(true);
    }
    
}
