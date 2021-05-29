public class StrReverse{
    public static void main(String[] args){
        System.out.print("Enter Capacitance (enter zero if not given): ");
        float C = TextIO.getlnFloat();
        System.out.print("Enter Current (enter zero if not given): ");
        float i = TextIO.getlnFloat();
        System.out.print("Enter Resistanve (enter zero if not given): ");
        float R = TextIO.getlnFloat();
        System.out.print("Enter time (enter zero if not given): ");
        float t = TextIO.getlnFloat();
        System.out.print("Enter Resistivity (enter zero if not given): ");
        float p = TextIO.getlnFloat();
        System.out.print("Enter Length (enter zero if not given): ");
        float L = TextIO.getlnFloat();
        System.out.print("Enter Cross Sectional Area (enter zero if not given): ");
        float A = TextIO.getlnFloat();
//        System.out.println(String.format("%3.3f",C));
        double v=0;
        if(i>0 && t>0 && C>0)
            v=getVoltage(i,t, C);
        if(i>0 && R>0)
            v=getVoltage(i,R);
        if(i>0 && p>0 && L>0 && A>0)
            v=getVoltage(i,p,L,A);

        System.out.println(String.format("The voltage is %3.3f", v));
    }
    public static double getVoltage(double i, double t, double C){
        return (i*t)/C;
    }
    public static double getVoltage(double i, double R){
        return i*R;
    }
    public static double getVoltage(double i, double p, double L, double A){
        return (i*p*L)/A;
    }
}