public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int spellPower, int transgression, int hardworking, int loyal, int honest) {
        super(name, spellPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
@Override
    public String toString() {
        return super.toString() + "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    public void compare(Hufflepuff hufflepuff) {
        System.out.println((hardworking + loyal + honest) > (getHardworking() + getLoyal() + getHonest()) ?
                getName() + "обладает большей силой чем " + hufflepuff.getName() :
                getName() + "лучший Грифиндорец чем " + hufflepuff.getName());
    }
}