import javax.swing.JFrame;

/**
   Quote Options is a app that chance text depending of options selection.
   Concepts radio buttons, the best way to use radio buttons is in group together.
*/

public class QuoteOptions{

    public static void main(String[] args){

	JFrame frame = new JFrame("Quote Options");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	QuoteOptionsPanel  panel = new QuoteOptionsPanel();
	frame.getContentPane().add(panel);

	frame.pack();
	frame.setVisible(true);
    }
}
