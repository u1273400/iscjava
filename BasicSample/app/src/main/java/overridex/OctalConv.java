package overridex;

public class OctalConv extends BinaryConv {
   
    public OctalConv(int v){
        super(v);
    }
    
    public String convert(){//overriden by subclasses
        // call the base class function
        String st=convert(val);

        // first let's group the  result of the binary function into threes

        // first get the remainder
        int rem=st.length()%3;

        // pad if remainder doesn't equal 0
        if(rem!=0)st=rem==1?"00"+st:"0"+st;

        // split the string into groups of threes
        int stl=st.length()/3;

        //use a for loop, supstring and lookup to convert to radix
        String oct="";
        for(int i=0;i<stl;i++)
            oct+=lookup(st.substring(i*3,i*3+3));
        return oct;
    }
}
