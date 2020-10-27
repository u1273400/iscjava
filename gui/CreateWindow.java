package gui;
import javax.swing.JFrame;

public class CreateWindow{

    public CreateWindow(){
        JFrame frame = new JFrame("Using JFrame");
        frame.setSize(400,300);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String ar[]){
        new CreateWindow();
    }
}