public class Day40 {

    public static void main(String[] args) {

        int number = 100;
        Integer intWrapperNumber = Integer.valueOf(number);
        int unboxNumber = intWrapperNumber.intValue();
        System.out.println(number);
        System.out.println(intWrapperNumber);
        System.out.println(unboxNumber);

        System.out.println("============");

        int value = Integer.parseInt("500");
        Integer newValue = Integer.valueOf("750");
        System.out.println(value);
        System.out.println(newValue);

        System.out.println("============");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println("============");

        Integer a = 100;
        Integer b = 100;
        Integer x = 200;
        Integer y = 200;

        System.out.println(a==b);
        System.out.println(x==y);
        System.out.println("============");
        System.out.println(a.equals(b));
        System.out.println(x.equals(y));
    }
}
