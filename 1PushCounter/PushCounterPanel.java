import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
Agregando el panel, aqui en el panel es donde todo se va organizar para mostrar, es lightweight container, es de decir, que el panel lo renderiza java y no tanto el sistema operativo, y para ser visualizado necesita de otro contenedor
*/
public class PushCounterPanel extends JPanel{
    private int count;
    private JButton button;
    private JLabel label;
    
    public PushCounterPanel(){
	count=0;	

	button = new JButton("Push me");
	button.addActionListener( new ButtonListener() ); //Agregamos nuestro Listener objetc
	
	label = new JLabel("Pushes " + count);

	add(button); //Lo agregamos al panel
	add(label);
	
	setBackground(Color.cyan);
	setPreferredSize(new Dimension(300,40));
    
    }
    
    /**  Inner class
	Represent a listener for button push(action) event
	Para cada event object habra un listener object.
    */
    private class ButtonListener implements ActionListener{

	/** Este metodo es llamado cada vez que es presionado el boton, es decir,
	    Jbutton generates an action event.
	    ActionPerdormed es la accion a realizar cuando eschuche al evento.
	*/
	@Override
	public void actionPerformed(ActionEvent event){
	    count++;
	    label.setText("Pushes " + count);
	}
    }
    
    
}    

    

