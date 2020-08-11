import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Example in which one listener objects is used to listen two diferent components */
public class LeftRightPanel extends Panel{
    private JButton left, right;
    private JLabel label;
    private JPanel buttonPanel;

    public LeftRightPanel(){
	left = new JButton("Left");
	right = new JButton("Right");
	
	ButtonListener listener = new ButtonListener();
	left.addActionListener(listener);
	right.addActionListener(listener);
	
	label = new JLabel("Push a button");

	//Creando un nuevo panel
	buttonPanel = new JPanel();
	buttonPanel.setPreferredSize(new Dimension(200,40));
	buttonPanel.setBackground(Color.blue);
	buttonPanel.add(left);
	buttonPanel.add(right);

	//Ajustando valores al penel principal
	setPreferredSize(new Dimension(200, 80) );
	setBackground(Color.cyan);
	add(label);
	add(buttonPanel); //Agrego nuestro subpanel que contiene nuestros botonones
				     
	
    }

    /** Represetn listener for  both buttons.
       Crear un inner class para listener para poder manipular sus datos y
       actulizar los componentes de la clase, la venteja de la clase es scope de los datos
    */
    private class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event){
	    if(event.getSource() == left ){
		label.setText("Left");
	    }else{
		label.setText("Right");
	    }
	    
	}
    }
    
    
}
