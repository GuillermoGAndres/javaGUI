import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   Quote Options is a app that chance text depending of options selection.
   Concepts radio buttons, the best way to use radio buttons is in group together.
*/

public class QuoteOptionsPanel extends JPanel{
    private JLabel quote;
    private String comedyQuote;
    private String philosophyQuote;
    private String carpentryQuote;
    private JRadioButton comedy, philosophy, carpentry;
	
    public QuoteOptionsPanel(){
	//Create text for my aplication
	comedyQuote = "Take my wife, please";
	philosophyQuote = "I think therefore I am";
	carpentryQuote = "Measure twince, cut one";

	quote = new JLabel(comedyQuote);
	quote.setFont( new Font("Helvetica", Font.BOLD, 24 ) );
	//Create insctances for buttons
	comedy = new JRadioButton ("comedy");
	comedy.setBackground(Color.green);
	philosophy = new JRadioButton ( "philosophy");
	philosophy.setBackground(Color.green);
	carpentry = new JRadioButton ( "carpentry");
	carpentry.setBackground(Color.green);
	//Agrego los buttons in a group
	ButtonGroup group = new ButtonGroup();
	group.add(comedy);
	group.add(philosophy);
	group.add(carpentry);
	//Agrego sus listener
	QuoteListener listener = new QuoteListener();
	comedy.addActionListener(listener);
	philosophy.addActionListener(listener);
	carpentry.addActionListener(listener);

	//Al final lo agrego al panel
	add(quote);
	add(comedy);
	add(philosophy);
	add(carpentry);
	//Finalmente ajustu nuestro size of my panel
	setPreferredSize( new Dimension(350, 100) );
	setBackground(Color.red);

    }

    private class QuoteListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event){
	    Object source = event.getSource();
	    if(source == comedy)
		quote.setText(comedyQuote);
	    else if (source == philosophy)
		quote.setText(philosophyQuote);
	    else
		quote.setText(carpentryQuote);
	    
	}
    }
}

	
	
