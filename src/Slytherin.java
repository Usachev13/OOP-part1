public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int spellPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, spellPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
@Override
    public String toString() {
        return super.toString() + "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    public void compare(Slytherin slytherin) {
        System.out.println((cunning + determination + ambition + resourcefulness + lustForPower) > (getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower()) ?
                getName() + "обладает большей силой чем " + slytherin.getName() :
                getName() + " обладает меньшей силой чем " + slytherin.getName());
    }
}