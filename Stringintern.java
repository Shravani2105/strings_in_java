public class Stringintern {
    public static void main(String[] args) {
        String s1=new String("charan");
        String s2="charan";
        String s3=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
