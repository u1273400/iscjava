package iscnotes;

import io.TextIO;

public class VoltageOverloading {
    public static void main (String [] args){
      double current=0,resistance=0,time=0,capacitance=0;
      double volt=0;
      System.out.print("enter current: ");
      current=TextIO.getDouble();
      System.out.print("enter capacitance: ");
      capacitance=TextIO.getDouble();
      System.out.print("enter resistance: ");
      resistance=TextIO.getDouble();
      System.out.print("enter time: ");
      time=TextIO.getDouble();

      if(capacitance==0){
        volt=getVoltage(current,resistance);
        System.out.println("v=IR="+volt);
      }else if(resistance==0){
        volt=getVoltage(current,capacitance,time);
        System.out.println("v=It/C="+volt);
      }else{
        volt=getVoltage(current,resistance);
        System.out.println("v=IR="+volt);
        volt=getVoltage(current,capacitance,time);
        System.out.println("v=It/C="+volt);
      }
    }

    public static double getVoltage(double curr, double res){
      return res * curr;
    }

    public static double getVoltage(double curr, int cap, double time ){
      return time * curr / cap;
    }
}
