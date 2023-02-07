public class Stringformat {
    public static void main(String[] args) {
        String name="Charan";
        String a=String.format("name is %s",name);
        String b=String.format("value is %f",13.1232123);
        String d=String.format("value is %32.12f",23.44294);

        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
    }
}
