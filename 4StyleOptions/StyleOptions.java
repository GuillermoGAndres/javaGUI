import javax.swing.JFrame;

/**
   Modificando styles fonts dependiendo de las check boxes uf checked or unchecked.
   Utilizaremos JCheckBox;
*/

/**
Este contendra nuestra clase principal, para ejecutar nuestra app.
*/
public class StyleOptions {

    public static void main(String[] args){
	//Crear y ajustar nuestra Windows
	JFrame frame = new JFrame("Style Options");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Le indicamos que cuando se cierra la ventana, termine el programa
	//Crear y agregar nuestro panel
	StyleOptionsPanel panel = new StyleOptionsPanel();
	frame.getContentPane().add(panel);
	//Adaptar y ser visible nuestro Frame
	frame.pack();
	frame.setVisible(true);
    }
}
