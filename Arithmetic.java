import java.util.Scanner;

class Arithmetic{
    protected float a;
    protected float b;
    Arithmetic(float a, float b){
        this.a=a;
        this.b=b;
    }

    float calc(){return 0;}

    public static void main(String[] ar){
        System.out.print("\nEnter first number: ");
        float a=( new Scanner(System.in)).nextFloat();
        System.out.print("\nEnter second number: ");
        float b=( new Scanner(System.in)).nextFloat();
        System.out.println(String.format("%1.1f+%1.1f=%2.2f",a,b,(new Add(a,b)).calc()));
        System.out.println(String.format("%1.1f/%1.1f=%2.2f",a,b,(new Div(a,b)).calc()));
        System.out.println(String.format("%1.1f*%1.1f=%2.2f",a,b,(new Mul(a,b)).calc()));
        System.out.println(String.format("%1.1f-%1.1f=%2.2f",a,b,(new Sub(a,b)).calc()));
        System.out.println(String.format("%1.1f(abstract)%1.1f=%2.2f",a,b,(new Arithmetic(9,8)).calc()));
    }

}
