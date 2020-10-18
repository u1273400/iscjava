package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class SimpleCalc extends JFrame{

    public SimpleCalc(){

        //initialise frame
        this.initFrame();

        //create button grid
        JPanel buttons=this.createButtonGrid();

        //creating a button
        JTextField display=new JTextField("0",10);

        //add contents and show frame
        getContentPane().add(buttons,BorderLayout.CENTER);
        getContentPane().add(display,BorderLayout.NORTH);
        pack();
        setVisible(true);
    }

    private JPanel createButtonGrid(){
        JPanel buttons=new JPanel();
        return buttons;
    }

    private void initFrame(){
        setTitle("Using JFrame2");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String ar[]){
        new SimpleCalc();
    }
}