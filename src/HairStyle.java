public class HairStyle implements Features {
    private String hairStyle;

    public HairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    @Override
    public void decorate(Character character) {
        character.setHairStyle(hairStyle);
    }
}
