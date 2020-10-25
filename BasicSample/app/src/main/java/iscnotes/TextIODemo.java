package iscnotes;

import io.TextIO;
public class TextIODemo{

  public static float add(float a, float b){
    return a+b;
  }

  public static float sub(float a, float b){
    return a-b;
  }

  public static float mul(float a, float b){
    return a*b;
  }

  public static float div(float a, float b){
    return a/b;
  }

  public static void main (String[] a){
    System.out.print("Enter the first value: ");
    float x=TextIO.getlnFloat();
    System.out.print("Enter the second value: ");
    float y=TextIO.getlnFloat();
    System.out.println( x+"+"+y+"="+add(x,y) ); //
    System.out.println( x+"-"+y+"="+sub(x,y) ); //
    System.out.println( x+"x"+y+"="+mul(x,y) ); //
    System.out.println( x+"/"+y+"="+div(x,y) ); //
  }
}




