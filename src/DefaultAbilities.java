import java.util.Objects;

public abstract class DefaultAbilities {
    // Abstract method to retrieve the ability name.
    abstract String getAbility();

    // Abstract method to retrieve the power level of the ability.
    abstract int getPower();

    // Override of the equals method to compare DefaultAbilities objects based on ability and power.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultAbilities other = (DefaultAbilities) obj;
        return Objects.equals(getAbility(), other.getAbility()) &&
                getPower() == other.getPower();
    }
}
