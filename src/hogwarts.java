public class hogwarts {
    private String name;
    private int spellPower;
    private int transgression;

    private String faculty;

    public hogwarts(String name, int spellPower, int transgression, String faculty) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgression = transgression;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}