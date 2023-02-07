public class Stringindexof {
    public static void main(String[] args) {
        String s1="This is Charan";
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("Charan");
        System.out.println(index1+"  "+index2);
        int index3=s1.indexOf("is",4);
        System.out.println(index3);
        int index4=s1.indexOf('s');
        System.out.println(index4);
    }
}
