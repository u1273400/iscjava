package tests;
import gui.Calculator;

import java.util.Scanner;

public class TestCalc {
    public static void main (String arg[]){
        Calculator calc=new Calculator();
        Scanner x=new Scanner(System.in);
        while(true) {
            System.out.print("calc> ");
            String result=calc.calculate(x.nextLine());
            System.out.println(String.format("calc> %s",result));
        }
    }
}
