public class Cascade{
    public static void main(String []ar){
        int a=10, b=20;
        char op='+';
        int c=0;
        switch(op) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            default:
                break;
        }
        System.out.println(c);
    }
}