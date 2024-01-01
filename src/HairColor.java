public class HairColor extends Features {
    // Implementation of the decorate method from the Features interface.
    @Override
    public void decorate(Character character, String hairColor) {
        // Set the hair color of the provided Character object.
        character.setHairColor(hairColor);
    }
}
