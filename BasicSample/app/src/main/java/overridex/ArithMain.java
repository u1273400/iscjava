package overridex;
import io.TextIO;

public class ArithMain{

  public static void main(String ar[]){
    double x,y;
    System.out.print("Enter the first value: ");
    x=TextIO.getDouble();
    System.out.print("Enter the second value: ");
    y=TextIO.getDouble();
    System.out.print("Enter the operation (+,-,/,x) ");
    char o=TextIO.getChar();
    Arithmetic op;
    switch(o){
      case '+':
        op=new Sum();
        break;
      case '-':
        op=new Sub();
        break;
      case 'x':
        op=new Mul();
        break;
      case '/':
        op=new Div();
        break;
      default:
        op=new Arithmetic();
        System.out.println("Invalid operation selected");
      break;
    }
    double result=op.calculate(x,y);
    System.out.println(String.format("%3.1f %s %3.1f = %3.2f",x,o,y,result));
  }
}