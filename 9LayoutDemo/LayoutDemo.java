import javax.swing.*;

/**
 * Utilzaresmo uno contenedor diferente a los que hemos utlizaso como JPanel que tambien es un contendedor
 * Utlizaresmo JTabbedPane
 */

public class LayoutDemo {

    public static void main(String[] args){
        JFrame freme = new JFrame("Layout Maneger Demo2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Intro", new IntroPanel());
        tp.addTab("Flow", FlowPanel());

                
