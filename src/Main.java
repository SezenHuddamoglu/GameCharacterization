public class Main {

    public static void main(String[] args) {

        ConcreteCharacter character = new ConcreteCharacter("blue", "black", "curly");
        System.out.println(character.getDescription());
        character.setEyeColor("green");
        character.setHairColor("blonde");
        System.out.println(character.getDescription());
        character.setHairStyle("straight");
        System.out.println(character.getDescription());


        Axe axe = new Axe(character);
        Shield shield = new Shield(character);
        Armour armour = new Armour(character);
        Gunshot gunshot = new Gunshot(character);
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());


        character.setAttackInventory(axe);
        character.setDefenseInventory(shield);

        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println(axe.getDescription());
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());
        System.out.println(shield.getDescription());

        character.setAttackInventory(gunshot);
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());



        System.out.println(character.getHealth());
        character.takeDamage(10);
        character.takeDamage(10);
        character.getStronger(10);
        character.takeDamage(30);
        character.takeDamage(100);

    }
}