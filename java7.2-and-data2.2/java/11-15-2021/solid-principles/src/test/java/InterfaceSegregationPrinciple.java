import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 10:28 AM
 */
public class InterfaceSegregationPrinciple {
    @Test
    public void testPerson() {
        Animal animal = new Animal();
        Person person = new Person(0L, "Leon");
        Serializable serializable = person;
        Identifiable identifiable = person;
        printAllIdentifiableObjects(identifiable, person, animal);
        printAllSerializableObjects(serializable, person, animal);
    }

    private void printAllIdentifiableObjects(Identifiable... identifiables) {
        for(Identifiable identifiable : identifiables) {
            System.out.println(identifiable.identify());
        }
    }

    private void printAllSerializableObjects(Serializable... serializables) {
        for(Serializable serializable : serializables) {
            System.out.println(serializable.serialize());
        }
    }
}
