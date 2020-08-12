import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** 
    Componets utility are JTextField, JLabel
 */
public class FarenheitPanel extends Panel{
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField farenheit;
    
    public FarenheitPanel(){
	inputLabel = new JLabel("Enter Farenheit tempeture: ");
	outputLabel = new JLabel("Temperature in Celcius: ");
	resultLabel = new JLabel("----");
	
	farenheit = new JTextField(5); //especifica el tamaño del campo con un numero de caracteres basado en fonts.
	farenheit.addActionListener( new TempListener());

	//Add panel
	add(inputLabel);
	add(farenheit);
	add(outputLabel);
	add(resultLabel);
	//Estilizarlo, darle estilo
	setBackground(Color.yellow);
	setPreferredSize(new Dimension(300, 74) );
	
    }

    /**
       Necesitamos ahora un listener que listen el action event
       Note that a push button and text field generate that the same kind of event: an action event.
       Dependiendo de cada tipo de evento, le coresponede un tipo listener.
       same listner object can be used to listen to multiple components at the same time.
    */

    private class TempListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event){
	    int farenheitTemp, celciusTemp;
	    String text = farenheit.getText();

	    farenheitTemp = Integer.parseInt(text);
	    celciusTemp = (farenheitTemp-32) * 5/9;
	    resultLabel.setText(Integer.toString(celciusTemp));
	    
	}
    }
}
