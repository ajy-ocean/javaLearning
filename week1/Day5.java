public class Day5 {

    public static void main(String[] args) {

        int x = 5;

        int a = x++;
        int b = ++x;

        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

        int y = 10;
        int result = y++ + 2;

        System.out.println(y);
        System.out.println(result);
    }
}
