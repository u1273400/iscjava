//import static java.lang.System.out;

class StringExample{
    public static void main (String[] arg){

        String s = "hello world";
        String y = new String("hello java");
        String news = new String();
        String newy = new String();
        for(int i = 0;i< s.length();i++){
            news=news+s.charAt(s.length()-1-i);
        }
        for(int i = 0;i< y.length();i++){
            newy=newy+y.charAt(y.length()-1-i);
        }
        System.out.println(news);
        System.out.println(newy);
    }

}