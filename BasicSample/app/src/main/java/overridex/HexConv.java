package overridex;

public class HexConv extends BinaryConv {
    public HexConv(int num){
        super(num);//val=num;
    }
    public String convert(){//overriden by subclasses
        // call the base class function
        String st=convert(val);

        // first let's group the  result of the binary function into threes

        // first get the remainder
        int rem=st.length()%4;

        // pad if remainder doesn't equal 0
        if(rem!=0){
            if (rem==1)
                st="000"+st;
            else if(rem==2)
                st="00"+st;
            else
                st="0"+st;
        }

        // split the string into groups of threes
        int stl=st.length()/4;

        //use a for loop, supstring and lookup to convert to radix
        String hex="";
        for(int i=0;i<stl;i++)
            hex+=lookup(st.substring(i*4,i*4+4));
        return hex;
    }
}
