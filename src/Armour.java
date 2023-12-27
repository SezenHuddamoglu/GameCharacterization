public class Armour implements DefenseInventory{
    private int defensePower;
    private String description;


    public Armour() {
        this.defensePower = 25;
        this.description = "armour";
    }

    @Override
    public int getDefensePower() {
        return defensePower;
    }

    @Override
    public String getDescription() {
        return description;
    }
}


