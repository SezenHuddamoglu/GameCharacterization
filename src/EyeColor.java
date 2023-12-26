public class EyeColor implements Features {
    private String eyeColor;

    public EyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public void decorate(Character character) {
        character.setHairColor(eyeColor);
    }
}


