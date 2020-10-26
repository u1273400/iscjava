 
package iscnotes;

import java.util.Scanner;
import io.TextIO;

public class LoanCalc{

  private int yrs;
  private double rate;
  private double amount;
  
  public LoanCalc(int y,double r, double a){
    this.rate=r;
    this.amount=a;
    this.yrs=y;
  }
  
  

  public double ammortize() {
    double r=rate/(100*12);
    double n=yrs*12;
    double a=amount;
    double d = (Math.pow((1 + r),n)- 1)/ (r*Math.pow((1 + r),n));
    return a/d ;
  }

  public static void main(String ar[]){
    //t5 Scanner s=new Scanner(System.in);
    System.out.println("Enter years=7:");
    int y=TextIO.getInt();int r=3;double a=10000;
    LoanCalc carloan=new LoanCalc(y,r,a);
    double p=carloan.ammortize();
    System.out.println(String.format("monthly payments on %3.2f for %dyrs at %d%% is %3.2f",a,y,r,p));
  }
}
