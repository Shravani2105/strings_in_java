public class Stringgetchar {
    public static void main(String[] args) {
        String str = new String("This is Charan padma srikhar");
        char[] ch = new char[10];
        try{
            str.getChars(7, 15, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
    }
}
