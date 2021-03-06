package overridex;

public class BinaryConv {
    protected int val;

    public BinaryConv(int v){
        this.val=v;
    }
    
    protected String lookup(String num){
        String rv="";
        if(num.length()==3){
            if(num.equals("000"))rv="0"; 
            if(num.equals("001"))rv="1"; 
            if(num.equals("010"))rv="2"; 
            if(num.equals("011"))rv="3"; 
            if(num.equals("100"))rv="4"; 
            if(num.equals("101"))rv="5"; 
            if(num.equals("110"))rv="6"; 
            if(num.equals("111"))rv="7"; 
        }else{
            if(num.equals("0000"))rv="0"; 
            if(num.equals("0001"))rv="1"; 
            if(num.equals("0010"))rv="2"; 
            if(num.equals("0011"))rv="3"; 
            if(num.equals("0100"))rv="4"; 
            if(num.equals("0101"))rv="5"; 
            if(num.equals("0110"))rv="6"; 
            if(num.equals("0111"))rv="7"; 
            if(num.equals("1000"))rv="8"; 
            if(num.equals("1001"))rv="9"; 
            if(num.equals("1010"))rv="A"; 
            if(num.equals("1011"))rv="B"; 
            if(num.equals("1100"))rv="C"; 
            if(num.equals("1101"))rv="D"; 
            if(num.equals("1110"))rv="E"; 
            if(num.equals("1111"))rv="F"; 
        }
        return rv;
    }

    public String convert(int num){//overriden by subclasses
        int rem;
        String s;
        if (num<=1)
        {
            return num==1?"1":"0";
        }
        rem = num % 2;
            s=convert(num /2);
            s+=rem==1?"1":"0";
        return s;    
    }
}
