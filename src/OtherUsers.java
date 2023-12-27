public class OtherUsers implements Observer {
    private ConcreteCharacter character;
    private CharacterState oldState;
    private int oldHealth;
    private int oldAttackPower;
    private int oldDefensePower;

    public OtherUsers(ConcreteCharacter character) {
        this.character = character;
    }

    @Override
    public void update() {
        // Sadece değişen özellikleri yazdırıyoruz
        if (character.getCurrentState() != oldState) {
            System.out.println("Karakter durumu değişti: " + character.getCurrentState().getClass().getSimpleName());
            oldState = character.getCurrentState();
        }

        if (character.getHealth() != oldHealth) {
            System.out.println("Karakter sağlığı: " + character.getHealth());
            oldHealth = character.getHealth();
        }

        if (character.getCurrentAttackPower() != oldAttackPower) {
            System.out.println("Karakter saldırı gücü: " + character.getCurrentAttackPower());
            oldAttackPower = character.getCurrentAttackPower();
        }

        if (character.getCurrentDefensePower() != oldDefensePower) {
            System.out.println("Karakter savunma gücü: " + character.getCurrentDefensePower());
            oldDefensePower = character.getCurrentDefensePower();
        }
    }
}

