public class Test{
    public static void main (String ar[]){
        Test t=new Test();
        t.sayHello();
        double a=10.0, b = 10.0;
        System.out.println("212F in Degrees celsius = "+toFahr(212));
        System.out.println("100C in Degrees Fahrenheit = "+toCelsius(100));
        System.out.println("10+10="+Test.add(a,b));
        System.out.println("10-10="+sub(a,b));
        System.out.println("10*10="+mul(a,b));
        System.out.println("10/10="+div(a,b));
    }
    public void sayHello (){
        System.out.println("hello world");
    }
    public static double toFahr (double f){
        return (f-32.0)*5.0/9.0;
    }
    public static double toCelsius (double c){
        return 9.0/5.0*c+32.0;
    }
    public static double add (double a, double b){
        return a+b;
    }
    public static double sub (double a, double b){
        return a-b;
    }
    public static double mul (double a, double b){
        return a*b;
    }
    public static double div (double a, double b){
        return a/b;
    }
}