import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; //Para el evento ChangeEvent

/**
   Demuestra el uso de Slider component
   Slider RGB
   Representa un frame con un panel de control y panel que cambia el color
       conforme el slider va cambiando
   This is our panel main.
*/

public class SliderColorPanel extends JPanel{
    private JPanel controls, colorPanel;
    private JSlider rSlider,gSlider, bSlider;
    private JLabel rLabel, gLabel, bLabel;

    /**
     * Sets up the sliders and their label, aligning them along their left edge
     * using a box layout.
    */
    public SliderColorPanel(){
	//Contructor: Horientacion(VERTICAL OR HORIZONTAL), valor incial, valor final, y valor donde inicia
	rSlider =  new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	rSlider.setMajorTickSpacing(50); //  Valor de marcas de intervalor de separacion del slider.
	rSlider.setMinorTickSpacing(10); //Valor de marcar intermedias, son un las pequeñas que aparecen despues de las grandes.
	//Ninguno de los dos se muestra por defecto,tenemos que invocar su metodo para hacerlo visible
	rSlider.setPaintTicks(true); //tick mark = marcas de graduacion
	//Labels indicating the value of the major tick marks are displayed if indicated by call to the setPaintLabesl methods
	rSlider.setPaintLabels(true);
	rSlider.setAlignmentX(Component.LEFT_ALIGNMENT); //*
	
	gSlider = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
	gSlider.setMajorTickSpacing(50);
	//gSlider.setMinorTickSpacing(10); //Descomentar si tienes curiosidad sobre que es y ver la imagen que es lo que cambio.
	gSlider.setPaintTicks(true);
	gSlider.setPaintLabels(true);
	gSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

	bSlider = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
	bSlider.setMajorTickSpacing(50);
	bSlider.setMinorTickSpacing(10);
	bSlider.setPaintTicks(true);
	bSlider.setPaintLabels(true);
	bSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

	//Agremos su listener
	SliderListener listener = new SliderListener();
	rSlider.addChangeListener(listener);
	gSlider.addChangeListener(listener);
	bSlider.addChangeListener(listener);

	//Ajustamos sus labels
	rLabel = new JLabel("Red: 0");
	rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      	gLabel = new JLabel("Green: 0");
	gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	bLabel = new JLabel("Blue: 0");
	bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

	//Crear el Panel de control de los sliders
	controls = new JPanel();
	//Creamos un layout Manager para una mejor organizacion de nuestro componentes
	BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
	controls.setLayout(layout);
	controls.add(rLabel);
	controls.add(rSlider);
	controls.add(Box.createRigidArea( new Dimension(0,20) ) );

	controls.add(gLabel);
	controls.add(gSlider);
	controls.add(Box.createRigidArea( new Dimension(0,20) ) );

	controls.add(bLabel);
	controls.add(bSlider);

	//Creamos el panel que va cambiar de color
	colorPanel = new JPanel();
	colorPanel.setPreferredSize( new Dimension(100, 100) );
	colorPanel.setBackground(new Color(0, 0, 0) );

	//Agregamos estos dos paneles a nuestro panel principal
	add(controls);
	add(colorPanel);
    	
    }

    /**
       Represent the listener for all sliders.
       Slider produces a change event, indicating that the position of the slider and the value it represents
       have changed.
    */
    private class SliderListener implements ChangeListener{
	private int red, green, blue;

	/**
	   Obtiene el valor de cada slider, despues actualiza las etiquetas 
	   y el color del panel
	   StateChange is called whenever any of the sliders is adjusted.
	*/
	@Override
	public void stateChanged(ChangeEvent event){
	    red = rSlider.getValue();
	    green = gSlider.getValue();
	    blue = bSlider.getValue();

	    rLabel.setText("Red: " + red );
	    gLabel.setText("Green: " +  green);
	    bLabel.setText("Blue: " + blue);

	    colorPanel.setBackground( new Color(red, green, blue) );
	}
    }
}
	
	    
	    
	
