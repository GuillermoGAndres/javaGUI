import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.AudioClip;
import java.net.URL;

/**
 *Representa el panel de control the juke box
*/
public class JukeBoxControls extends JPanel{
    private JComboBox musicCombo;
    private JButton stopButton, playButton;
    private AudioClip[] music; //Represetan sound clip (rolon)
    private AudioClip current;

    public JukeBoxControls(){
	URL url1, url2, url3; //URL represeneta la ubicacion de recurso.
	url1 = url2 = url3= null;
	//Obtein and store the audio clips to play
	try{
	    //Utlizamos un try por si no se encuentra la cancion.
	    url1 = new URL("file", "localhost", "via-lactea.mp3"); // Contructor ( protocol, host, file)
	    url2 = new URL("file", "localhost", "Azul.mp3");
	    url3 = new URL("file", "localhost", "En-tu-planeta-me-quede.wav");
	}
	catch(Exception exception){
	    System.out.println("Su URL esta incorrecta");
	}
	
	music = new AudioClip[4];
	music[0] = null; //Corresponds to make a selection ...
	music[1] = JApplet.newAudioClip(url1);
	music[2] = JApplet.newAudioClip(url2);
	music[3] = JApplet.newAudioClip(url3);

	//Create the list of strings for the combo box options
	String[] musicNames = {"via lactea", "azul", "en tu planeta me quede"};
	musicCombo = new JComboBox(musicNames);
	musicCombo.setBackground(Color.cyan);

	//Set up the buttons
	playButton =  new JButton("Play", new ImageIcon("play.png") );
	playButton.setBackground(Color.green);
	stopButton = new JButton("Stop", new ImageIcon("stop.png") ); //representa una imagen
	stopButton.setBackground(Color.red);

	//Set up this panel
	setPreferredSize(new Dimension(250, 100) );
	setBackground(Color.blue);
	add(musicCombo);
	add(playButton);
	add(stopButton);

	//Agregar sus listener

	musicCombo.addActionListener( new ComboListener() );
	stopButton.addActionListener( new ButtonListener() );
	playButton.addActionListener( new ButtonListener() );

	current = null;
	//current = music[1];
	//current.play();
    }

    // Represent the action listener for the combo box
    private class ComboListener implements ActionListener{

	/**
	 *Stops playing the current selection(if any)  and reset the current selection to the chosen
	 */
	@Override
	public void actionPerformed(ActionEvent event){
	    System.out.println("Entro a l listener Combo box");
	    if( current != null){
    		current.stop();
	    }
	    current = music[ musicCombo.getSelectedIndex() ];
	}
    }
    /**
     *Represent the action listener for both control buttons.
     */
    private class ButtonListener implements ActionListener{
	/**
	 *Stops the current selection(if any) in either case
	 *If the play button was pressed, star playin it again
	 */
	@Override
	public void actionPerformed(ActionEvent event){
	    System.out.println("Entro al button");
	    if( current != null) //Signfica que si current tiene una cancion
		    current.stop();
	    if(event.getSource() == playButton)
		if(current != null)
		    current.play();
	}
    }
}
	    
	    
	
	
	
		

    
