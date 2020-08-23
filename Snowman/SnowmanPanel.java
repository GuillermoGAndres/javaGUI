import java.awt.*;
import javax.swing.*;
/**
 * Dos puntos clave, son dos cosas diferentes al agregar un componente y dibujar un componente
 * cuando preferimos dibujar un componente sobrescribimos el metodo painComponent
 * Al agregar el metodo automaticamente llama el metodo painComponent por eso se dibuja los componentes
 */

public class SnowmanPanel extends JPanel{
    private final int MID = 150;
    private final int TOP = 50;
    
    public SnowmanPanel(){
        setPreferredSize( new Dimension(300, 225) );
        setBackground(Color.cyan);    
    }
    
    /**
     * Utliza el metodo paintComponent es es llamado cada vez que se tiene que renderizar el componente
     * Contiene como parametro Graphics  object, representa un contexto grafico del componente
     * en este caso es el panel es dibujado.
     */
    @Override
    public void paintComponent(Graphics page){
        super.paintComponent(page); //llamamos al metodo padre para dibuje el componente
        page.setColor(Color.blue);
        page.fillRect(0, 175, 300, 50);
    
        page.setColor(Color.yellow);
        page.fillOval(-40,-40,80,80); 
    
        page.setColor(Color.white);
        page.fillOval(MID-20, TOP, 40, 40);
        page.fillOval(MID-35, TOP+35, 70, 50);
        page.fillOval(MID-50, TOP+80, 100, 60);

        page.setColor(Color.black);
        page.fillOval(MID-10, TOP+10, 5, 5);
        page.fillOval(MID-5, TOP+10, 5, 5);

        page.drawArc(MID-10, TOP+20, 20, 10, 190, 160); //SMILE
        
        page.drawLine(MID-25, TOP+60, MID-50, TOP+40); // left arm
        page.drawLine(MID+25, TOP+60, MID+55, TOP+60); // right arm
        page.drawLine(MID-20, TOP+5, MID+20, TOP+5);
         // brim of hat
        page.fillRect(MID-15, TOP-20, 30, 25);
     
    
    }

    

}
