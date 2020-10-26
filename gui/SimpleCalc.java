package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc extends JFrame implements ActionListener{

    private JTextField display;

    public SimpleCalc(){

        //initialise frame
        this.initFrame();

        //create button grid
        JPanel buttons=this.createButtonGrid();

        //creating a button
        display=new JTextField("0",20);

        //add contents and show frame
        getContentPane().add(buttons,BorderLayout.CENTER);
        getContentPane().add(display,BorderLayout.NORTH);
        pack();
        setVisible(true);
    }

    
    private JPanel createButtonGrid(){
        JPanel buttons=new JPanel();
        buttons.setLayout(new GridLayout(5,4));
        buttons.add(new JButton("1"));
        buttons.add(new JButton("2"));
        buttons.add(new JButton("3"));
        buttons.add(new JButton("4"));
        buttons.add(new JButton("5"));
        buttons.add(new JButton("6"));
        buttons.add(new JButton("7"));
        buttons.add(new JButton("8"));
        buttons.add(new JButton("9"));
        buttons.add(new JButton("0"));
        buttons.add(new JButton("A/C"));
        buttons.add(new JButton("C"));
        buttons.add(new JButton("M+"));
        buttons.add(new JButton("+"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("/"));
        buttons.add(new JButton("x"));
        buttons.add(new JButton("+/-"));
        buttons.add(new JButton("="));
        buttons.add(new JButton("."));
        // buttons.add(new JButton("1"));
        return buttons;
    }

    private void initFrame(){
        setTitle("Using JFrame2");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt){
        String op=evt.getActionCommand();
        switch(op){
            case "0":
                break;
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case ".":
                break;
            case "=":
                break;
            case "+":
                break;
            case "-":
                break;
            case "/":
                if(display.getText().equals("0")){
                    display.setText("div zero err");
                }

                break;
            case "x":
                break;
            case "AC":
                break;
            case "C":
                break;
            case "M+":
                break;
            case "+/-":
                break;
            default:
                break;
        }
    }

    public static void main(String ar[]){
        new SimpleCalc();
    }
}