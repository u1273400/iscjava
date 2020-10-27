package gui;

public class Calculator{

  private String val="";
  private String acc="0";
  private String op="";
  private String reg="";
  private boolean tmpReg=false;

  public double getReg() {
    return Double.parseDouble(reg);
  }

  public void setReg(String reg) {
    this.reg += reg;
  }

  public String calculate(String v) {
    try{
      int acc=Integer.parseInteger(v);
      if(tmpReg){
        setReg(v);
      }else{
        setVal(v);
      }
    }catch (NumberFormatException){
      switch(v){
        case ".":
          if(tmpReg){
            setReg(v);
          }else{
            setVal(v)
          }
          break;
        case "=":
          break;
        case "+":
          break;
        case "-":
          break;
        case "/":
          if(display.getText().equals("0")){
              display.setText("div zero err");
          }
          break;
        case "x":
          break;
        case "AC":
          break;
        case "C":
          break;
        case "M+":
          break;
        case "+/-":
          break;
        default:
          break;
      }
    }
    return val;
  }

  public void setOp(String op) {
    this.op = op;
  }

  private void add(){
    setVal(String.format("%10.10f",(getValue()+getReg())));
  }

  private Double getValue() {
    return Double.parseDouble(getVal());
  }

  private void div(){
    try{
      setVal(String.format("%10.10f",(getValue()/getReg())));
    } catch(Exception e){
      System.out.println(e.getMessage());
    };
  }

  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val += val;
  }

  public String getAcc() {
    return acc;
  }

  public void setAcc(String acc) {
    this.acc = acc;
  }
}