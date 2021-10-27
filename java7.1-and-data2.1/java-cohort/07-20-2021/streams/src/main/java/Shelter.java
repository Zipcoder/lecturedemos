/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 6:59 PM
 */
public interface Shelter <StoreableType> {
    void add(StoreableType objectToBeStored);
    StoreableType getByName(String name);
    void remove(StoreableType objcetToBeStored);
}
