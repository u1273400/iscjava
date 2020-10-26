package gui;

public class Calculator{

  private String val="";
  private String acc="0";
  private String op="";
  private String tempReg="";
  private boolean reg=false;

  public String calculate(String v) {
    try{
      int acc=Integer.parseInteger(v);
      if(reg){
        setOp(v);
      }else{
        setVal(v)
      }
    }catch (NumberFormatException){
        switch(v){
            case ".":
              setOp(v)
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
    this.op += op;
  }

  public Calculator(){

  }

  private void add(){
    setVal(""+(getValue()+x));
  }

  private Double getValue() {
    return Double.parseDouble(getVal());
  }

  private void div(){
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
    this.val += val;
  }

  public String getAcc() {
    return acc;
  }

  public void setAcc(String acc) {
    this.acc = acc;
  }
}