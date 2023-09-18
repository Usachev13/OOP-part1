public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creation;

    public Ravenclaw(String name, int spellPower, int transgression, int smart, int wise, int witty, int creation) {
        super(name, spellPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreation() {
        return creation;
    }
@Override
    public String toString() {
        return super.toString() +
                "Ум = " + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creation=" + creation +
                "}";
    }

    public void compare(Ravenclaw ravenclaw) {
        System.out.println((smart + wise + witty + creation) > (getSmart() + getWise() + getWitty() + getCreation()) ?
                getName() + "обладает большей силой чем " + ravenclaw.getName() :
                getName() + "лучший Грифиндорец чем " + ravenclaw.getName());
    }
}


