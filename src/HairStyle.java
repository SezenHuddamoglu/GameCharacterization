public class HairStyle extends Features {

    // Private instance variable to store the hair style.
  /*  private String hairStyle;

    // Constructor for the HairStyle class, takes a hair style as a parameter.
    public HairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }*/

    // Implementation of the decorate method from the Features interface.
    @Override
    public void decorate(Character character, String feature) {
        // Set the hair style of the provided Character object.
        character.setHairStyle(feature);
    }
}

