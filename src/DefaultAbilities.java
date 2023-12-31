import java.util.Objects;

public abstract class DefaultAbilities {
    abstract String getAbility();
    abstract int getPower();
    //public abstract boolean equals(Object obj);
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
