 
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

  public double getAmount() {
    return amount;
  }

  public double getRate() {
    return rate;
  }

  public int getYrs() {
    return yrs;
  }

  public void setYrs(int yrs) {
    this.yrs = yrs;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public static void main(String ar[]){
    //t5 Scanner s=new Scanner(System.in);
    System.out.println("Enter years=7:");
    int y=7;int r=3;double a=10000;
    LoanCalc carloan=new LoanCalc(y,r,a);
    double p=carloan.ammortize();
    System.out.println(String.format("monthly payments on %3.2f for %dyrs at %d%% is %3.2f",a,y,r,p));
//    y=7;r=4;a=9000;
//    carloan=new LoanCalc(y,r,a);
    carloan.setAmount(9000);
    carloan.setRate(4);
    carloan.setYrs(7);
    p= carloan.ammortize();
    System.out.println(String.format("monthly payments on %3.2f for %dyrs at %d%% is %3.2f",a,y,r,p));
  }
}
