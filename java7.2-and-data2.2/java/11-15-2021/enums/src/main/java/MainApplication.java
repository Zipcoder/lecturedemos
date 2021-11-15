/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 4:20 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        Suit heartEnumeration = Suit.HEARTS;
        int orderInWhichItWasDeclared = heartEnumeration.ordinal();
        String nameOfEnumeration = heartEnumeration.name();
        System.out.println(nameOfEnumeration);
        System.out.println(orderInWhichItWasDeclared);

        System.out.println("=========================");
        for (Suit enumeration : Suit.values()) {
            System.out.println(enumeration.ordinal());
            System.out.println(enumeration.name());
            System.out.println("---------------");
        }
    }
}
