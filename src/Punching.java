import java.util.Objects;

public class Punching extends DefaultAbilities {
    int power;
    private String description;
    private Character character;

    public Punching(Character character) {
        // Set default values for defensePower and description.
        this.power = 5;
        this.description = "punching";
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
