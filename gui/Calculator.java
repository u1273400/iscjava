package gui;

public class Calculator{

  private String val="0";
  private String acc="0";

  public Calculator(){

  }

  private void add(double x){
    setVal(""+(getValue()+x));
  }

  private Double getValue() {
    return Double.parseDouble(getVal());
  }

  private void div(double x){
    try{
      setVal(""+(getValue()/x));
    } catch(Exception e){
      System.out.println(e.getMessage());
    };
  }

  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }

  public String getAcc() {
    return acc;
  }

  public void setAcc(String acc) {
    this.acc = acc;
  }
}