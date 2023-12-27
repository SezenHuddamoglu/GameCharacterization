public class Shield implements DefenseInventory {
    private int defensePower;
    private String description;


    public Shield() {
        this.defensePower = 15;
        this.description = "shield";
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

