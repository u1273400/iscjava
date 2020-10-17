package gui;
import javax.swing.JFrame;

public class BasicButton{

    public BasicButton(){
        JFrame frame = new JFrame("Using JFrame2");
        frame.setSize(400,300);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String ar[]){
        new BasicButton();
    }
}