public class HairColor extends Features {

    // Private instance variables to store the decorated character and the hair color.
  //  Character decoratedCharacter;
    // private String hairColor;

    // Constructor for the HairColor class, takes a hair color as a parameter.
   /* public HairColor(Character decoratedCharacter,String hairColor) {
        this.decoratedCharacter=decoratedCharacter;
        this.hairColor = hairColor;
    }*/

    // Implementation of the decorate method from the Features interface.
    @Override
    public void decorate(Character character, String feature) {
        // Set the hair color of the provided Character object.
        character.setHairColor(feature);
    }
}
