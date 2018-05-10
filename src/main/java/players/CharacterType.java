package players;

public enum CharacterType {

    DWARF(Designation.WARRIOR),
    BARBARIAN(Designation.WARRIOR),
    KNIGHT(Designation.WARRIOR),
    WARLOCK(Designation.MAGE),
    WIZARD(Designation.MAGE),
    CLERIC(Designation.HEALER);

    private Designation designation;
    CharacterType(Designation designation){
        this.designation = designation;

    }

    public Designation getDesignation() {
        return designation;
    }
}
