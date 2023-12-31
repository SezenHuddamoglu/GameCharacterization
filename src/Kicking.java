import java.util.Objects;

public class Kicking extends DefaultAbilities {
    int power;
    private String description;
    private Character character;

    public Kicking(Character character) {
        // Set default values for defensePower and description.
        this.power = 7;
        this.description = "kicking";
        // Set the character reference to the provided Character object.
        this.character = character;
    }
    @Override
    public String getAbility() {
        return description;
    }

    @Override
    int getPower() {
        return power;
    }

}
