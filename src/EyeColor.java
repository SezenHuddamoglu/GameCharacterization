public class EyeColor extends Features {

    // Implementation of the decorate method from the Features interface.
    @Override
    public void decorate(Character character, String eyeColor) {
        // Set the eye color of the provided Character object.
        character.setEyeColor(eyeColor);
    }
}


