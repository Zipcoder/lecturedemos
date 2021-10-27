import java.util.Arrays;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/23/21 2:33 PM
 */
public class BasicRecursion {
    public static void main(String[] args) {
        recursiveMethod();
    }

    private static void recursiveMethod() {
        System.out.println("Hello");
        recursiveMethod();
    }

    public Person getPersonByName(Person[] personArray, String name) {
        for (int i = 0; i < personArray.length; i++) {
            Person person = personArray[i];
            if (name.equals(person.getName())) {
                return person;
            }
        }
        return null;
    }

    /**
     * Array must be sorted, therefore elements must be comparable
     *
     * @param personArray
     * @param name
     * @return
     */ // John George Todd Ashley Bob Ciara Sue
    public Person getPersonByNameBinSearch(Person[] personArray, String name) {
        Arrays.sort(personArray);
        if (personArray.length >= 1) { // has contents
            int leftPoint = 0;
            int rightPoint = personArray.length - 1;
            Person personToBeFound = binarySearch(personArray, name, leftPoint, rightPoint);
            return personToBeFound;
        } else {
            return null;
        }
    }

    private Person binarySearch(Person[] personArray, String name, int leftPoint, int rightPoint) {
        int distanceToMidPoint = (rightPoint - leftPoint) / 2;
        int midPoint = leftPoint + distanceToMidPoint;
        if (midPoint >= personArray.length) {
            return null;
        }
        Person personFound = personArray[midPoint];
        String nameFound = personFound.getName();
        boolean hasNameWeAreSeeking = nameFound.equals(name);
        if (hasNameWeAreSeeking) {
            return personFound;
        } else if (nameFound.compareTo(name) > 0) { // NAMEFOUND COMES AFTER NAME
            // seek first half; keep left point; change right point
            personFound = binarySearch(personArray, name, leftPoint, midPoint - 1);
            return personFound;
        } else if (nameFound.compareTo(name) < 0) { // seek second half
            personFound = binarySearch(personArray, name, midPoint + 1, rightPoint);
            return personFound;
        } else {
            return null;
        }
    }
}
