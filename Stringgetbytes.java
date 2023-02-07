public class Stringgetbytes {
    public static void main(String[] args) {
        String a = "CHARAN";
        byte[] barr = a.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }
    }
}
