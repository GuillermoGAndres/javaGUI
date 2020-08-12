import javax.swing.JFrame;

/**
   Demuestra el uso de Slider component
   Slider RGB
*/

public class SliderColor{
    /**
       Representa un frame con un panel de control y panel que cambia el color
       conforme el slider va cambiando
    */
    public static void main(String[] args){
	JFrame frame = new JFrame("Slider Color");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	SliderColorPanel panel = new SliderColorPanel();
	frame.getContentPane().add(panel);

	frame.pack();
	frame.setVisible(true);
    }
}
	
