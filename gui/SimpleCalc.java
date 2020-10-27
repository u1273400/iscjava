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
    private Calculator calc=new Calculator();

    public SimpleCalc(){

        //initialise frame
        this.initFrame();

        //create button grid
        JPanel buttons=this.createButtonGrid();

        //creating a button
        display=new JTextField("0",20);
        display.setEditable(false);
        //add contents and show frame
        getContentPane().add(buttons,BorderLayout.CENTER);
        getContentPane().add(display,BorderLayout.NORTH);
        pack();
        setVisible(true);
    }

    private JPanel createButtonGrid(){
        JPanel buttons=new JPanel();
        JButton b;
        buttons.setLayout(new GridLayout(5,4));

        b=new JButton("A/C");
        b.addActionListener(this);
        buttons.add(b);
        buttons.add(new JButton("C"));
        b=new JButton("M+");
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("+/-"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("7"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("8"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("9"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("x"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("4"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("5"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("6"); 
        b.addActionListener(this);
        buttons.add(b);
        b= new JButton("/");
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("1");
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("2");
        b.addActionListener(this);
        buttons.add(b);
        b= new JButton("3");
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("-"); 
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton(".");
        b.addActionListener(this);
        buttons.add(b);
        b= new JButton("0");
        b.addActionListener(this);
        buttons.add(b);
        b= new JButton("=");
        b.addActionListener(this);
        buttons.add(b);
        b=new JButton("+");
        b.addActionListener(this);
        buttons.add(b);
        return buttons;
    }

    private void initFrame(){
        setTitle("Using JFrame2");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt){
        String op=evt.getActionCommand();
        display.setText(calc.calculate(op));
    }

    public static void main(String ar[]){
        new SimpleCalc();
    }
}