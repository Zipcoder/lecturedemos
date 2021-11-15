/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 4:21 PM
 */
public enum Rank {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final Integer primaryValue;
    private final Integer secondaryValue;

    Rank(Integer value) {
        this.primaryValue = value;
        this.secondaryValue = value;
    }

    Rank(Integer primaryValue, Integer secondaryValue) {
        this.primaryValue = primaryValue;
        this.secondaryValue = secondaryValue;
    }

    public Integer getPrimaryValue() {
        return primaryValue;
    }

    public Integer getSecondaryValue() {
        return secondaryValue;
    }
}
