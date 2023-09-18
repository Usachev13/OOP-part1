public abstract class hogwarts {
    private final String name;
    private int spellPower;
    private int transgression;

    public hogwarts(String name, int spellPower, int transgression) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }
    public int getTransgression() {
        return transgression;
    }
    public String toString() {
        return
                "Имя = " + name +
                "\n сила магии = " + spellPower +
                "\n сила трансгрессии = " + transgression;
    }
    public void compare(hogwarts hogwarts){
        System.out.println((spellPower + transgression) > (hogwarts.getSpellPower() + hogwarts.getTransgression())?
                getName() + " обладает большей силой чем " + hogwarts.getName():
                getName() + " обладает меньшей силой чем " + hogwarts.getName());
    }
}