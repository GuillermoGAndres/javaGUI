import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   Modificando styles fonts dependiendo de las check boxes uf checked or unchecked.
   Utilizaremos JCheckBox;
*/

public class StyleOptionsPanel extends JPanel{
    private JLabel saying;
    private JCheckBox bold, italic;

    public StyleOptionsPanel(){
	saying = new JLabel("Say it with style!");
	//Font objet is defined by tha font name, the font style(reprented as an integer or constant) and the font size.
	saying.setFont( new Font("Helvetica", Font.PLAIN, 36 ) );

	bold = new JCheckBox("Bold");
	bold.setBackground(Color.cyan);
	italic = new JCheckBox("Italic");
	italic.setBackground(Color.cyan);
	//Creamos nuestro item listener object para nuestro item event 
	StyleListener listener = new StyleListener();
	bold.addItemListener(listener);
	italic.addItemListener(listener);

	add(saying);
	add(bold);
	add(italic);
	//Ajustamos nuestro panel style y tamaño
	setBackground(Color.blue);
	setPreferredSize(new Dimension(350, 100) );

    }

    /**
       Represent the listener for both check boxes
       The check box generate an item event
       Cada vez que genera un evento item event, manda a llamar al metodo itemStateChanged del objeto item listener.
    */
    private class StyleListener implements ItemListener{

	@Override
	/**
	   Update the syle of the label font style.
	*/
	public void itemStateChanged(ItemEvent event){
	    int style = Font.PLAIN;
	    if(bold.isSelected()){
		style = Font.BOLD;
	    }
	    if( italic.isSelected()){
		style = Font.ITALIC;
	    }
	    saying.setFont( new Font("Helvetica", style, 36 ) );
	}
    }
				
}
