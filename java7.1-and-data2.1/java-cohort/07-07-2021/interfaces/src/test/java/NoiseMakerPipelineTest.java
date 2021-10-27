import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/7/21 11:08 AM
 */
public class NoiseMakerPipelineTest {
    @Test
    public void testSqueezeNoiseOfOfNoiseMakers() {
        // given
        NoiseMakerPipeline pipeline = new NoiseMakerPipeline();
        Person leon = new Person(28, "Leon");
        NoiseMaker duck = new Ducky();
        NoiseMaker fox = new Fox();
        NoiseMaker[] noiseMakers = new NoiseMaker[]{leon, duck, fox};

        // when
        pipeline.squeezeNoiseOutOf(noiseMakers);

        // then
        // no assertion to be made; TODO -  check output
    }
}
