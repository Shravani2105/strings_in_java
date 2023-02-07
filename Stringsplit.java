public class Stringsplit {
    public static void main(String[] args) {
        String s1="Charan Srinivas Sukrutha";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
