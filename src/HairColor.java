public class HairColor implements Features {

    // Private instance variables to store the decorated character and the hair color.
    Character decoratedCharacter;
    private String hairColor;

    // Constructor for the HairColor class, takes a hair color as a parameter.
    public HairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    // Implementation of the decorate method from the Features interface.
    @Override
    public void decorate(Character character) {
        // Set the hair color of the provided Character object.
        character.setHairColor(hairColor);
    }
}
