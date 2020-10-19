package gui;

public class Calculator{

  private String val="0";
  private String acc="0";

  public Calculator(){

  }

  private void add(double x){
    setVal(getVal()+x);
  }

  private void div(double x){
    try{
      setVal(getVal()/x);
    } catch(Exception e){
      System.out.println(e.getMessage());
    };
  }

}