package gui;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class BasicButton{

    public BasicButton(){
        JFrame frame = new JFrame("Using JFrame2");
        frame.setSize(400,300);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating a button
        JButton b=new JButton("Just a button");

        //add button to frame
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(b);

        frame.setVisible(true);
    }
    public static void main(String ar[]){
        new BasicButton();
    }
}