/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/7/21 11:07 AM
 */ // Responsible for administrating noise makers as groups
public class NoiseMakerPipeline {
    public void squeezeNoiseOutOf(NoiseMaker[] noiseMakers) {
        for (int i = 0; i < noiseMakers.length; i++) {
            NoiseMaker noiseMaker = noiseMakers[i];
            noiseMaker.makeNoise();
        }
    }
}
