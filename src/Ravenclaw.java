public class Ravenclaw extends hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creation;

    public Ravenclaw(String name, int spellPower, int transgression, String faculty, int smart, int wise, int witty, int creation) {
        super(name, spellPower, transgression, faculty);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}


