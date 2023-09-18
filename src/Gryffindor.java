public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int spellPower, int transgression, int nobility, int honor, int courage) {
        super(name, spellPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\n благородство = " + nobility +
                "\n честь = " + honor +
                "\n храбрость = " + courage;
    }

    public void compare(Gryffindor gryffindor) {
        System.out.println((nobility + honor + courage) > (getNobility() + getHonor() + getCourage())?
                getName() + " лучший Гриффиндорец чем  " + gryffindor.getName():
                gryffindor.getName() + " лучший Грифиндорец чем " + getName());
    }
}