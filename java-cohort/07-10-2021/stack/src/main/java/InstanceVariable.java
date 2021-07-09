/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/9/21 11:03 AM
 */
public class InstanceVariable<SomeType extends Object> {
    private SomeType value;
    private InstanceVariable<SomeType> next;

    public InstanceVariable(SomeType initialValue) {
        this.value = initialValue;
    }

    public SomeType getValue() {
        return this.value;
    }

    public void setValue(SomeType valueToBeSet) {
        this.value = valueToBeSet;
    }

    public void printValue() {
        System.out.println(getValue());
    }

}
