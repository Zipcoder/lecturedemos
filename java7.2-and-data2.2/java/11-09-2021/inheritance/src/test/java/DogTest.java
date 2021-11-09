import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 10:44 AM
 */
public class DogTest {
    @Test
    public void makeNoise() {
        Dog dog = new Dog();
        Animal animal = new Dog();
        NoiseMaker noiseMaker = new Dog();
//        NoiseMaker noiseMakerAnimal = new Animal();
        String output = dog.makeNoise();
        System.out.println(output);
    }
}
