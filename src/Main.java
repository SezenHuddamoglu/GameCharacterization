public class Main {

    public static void main(String[] args) {

        ConcreteCharacter character = new ConcreteCharacter("mavi", "siyah", "duz");
        System.out.println(character.getDescription());
        character.setEyeColor("yesil");
        character.takeDamage(20);
        // character.setCurrentAttackPower(50);

        // Karakterin durumunu yazdır
        character.display();
        System.out.println(character.getDescription());

        Axe axeInventory = new Axe(20, "Axe");

        // ConcreteCharacter oluştur ve axeInventory'yi ayarla
        ConcreteCharacter player = new ConcreteCharacter("mavi", "siyah", "duz");
        player.setAttackPower(axeInventory);

        // Karakterin güç seviyesini kontrol et
        System.out.println("Player's Current Attack Power: " + player.getCurrentAttackPower());
    }
}

// Temel karakter oluştur
     /*   Character basicCharacter = new ConcreteCharacter();

        // Temel karaktere brownEyes özelliğini eklemek için bir Eyes dekoratörü oluştur
        Eyes brownEyesCharacter = new Eyes(basicCharacter);
        brownEyesCharacter.getBrownEyes();

        Hair curlyHairCharacter = new Hair(basicCharacter);
        curlyHairCharacter.getCurlyHair();
*/
        // Create a concrete character
       /* Subject character = new ConcreteCharacter();

        // Display the character
        character.display();

        // Simulate gameplay
        character.takeDamage(20);
        character.getStronger(10);

        // Change the state if needed
        ((ConcreteCharacter) character).setState(new HealthState(50));

        // Simulate gameplay with the new state
        character.takeDamage(30);
        character.getStronger(15);*/
