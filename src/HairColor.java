public class HairColor implements Features {
    Character decoratedCharacter;
    private String hairColor;

    public HairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public void decorate(Character character) {
        character.setHairColor(hairColor);
    }

}
