public class EyeColor extends Features {

    // Private instance variable to store the eye color.
  /*  private String eyeColor;

    // Constructor for the EyeColor class, takes an eye color as a parameter.
    public EyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }*/

    // Implementation of the decorate method from the Features interface.
    @Override
    public void decorate(Character character, String eyeColor) {
        // Set the eye color of the provided Character object.
        character.setEyeColor(eyeColor);
    }
}


