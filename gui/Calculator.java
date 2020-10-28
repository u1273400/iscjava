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
    if(reg.length()>15 || val.length()>15){
      if(tmpReg && reg.length()>0){
        return reg;
      }else if(val.length()>0){
        return val;
      }else
        return "0";   
    }
    try{
      int acc=Integer.parseInt(v);
      if(tmpReg){
        setReg(v);
        return reg;
      }else{
        setVal(v);
        return val;
      }
    }catch (NumberFormatException nfe){
      switch(v){
        case ".":
          if(tmpReg && !reg.contains(v)){
            setReg(v);
            return reg;
          }else if(!val.contains(v)){
            setVal(v);
            return val;
          }else{
            return val;
          }
        case "=":
          if(tmpReg){
            doOp();
            reg="";
            op="";
          }return val;
        case "+":
        case "/":
          if(tmpReg){
            doOp();
            reg="";
          }else{
            reg="";
            tmpReg=true;
          }
          setOp(v);
          return val;
        case "A/C":
          reg="";
          val="";
          tmpReg=false;
          break;
        case "C":
          if(tmpReg){
            reg="";
          }else{
            val="";
          }
          return "0";
        case "M+":
          break;
        case "+/-":
          break;
        default:
          if(tmpReg && reg.length()>0){
            return reg;
          }else if(val.length()>0){
            return val;
          }else
            return "0";
      }
      if(tmpReg && reg.length()>0){
        return reg;
      }else if(val.length()>0){
        return val;
      }else
        return "0";
    }
  }

  private void doOp() {
    switch(op){
      case "+":
        add();
        break;
      case "/":
        div();
        break;
      default:
        break;
    }
  }

  public void setOp(String op) {
    this.op = op;
  }

  private void add(){
    val=String.format("%10.5f",(getValue()+getReg()));
  }

  private Double getValue() {
    return Double.parseDouble(getVal());
  }

  private void div(){
    try{
      val=String.format("%10.5f",(getValue()/getReg()));
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