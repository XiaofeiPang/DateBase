package database;

public class Dome extends Item {
    private int number;

    public Dome(String title, int playtime, String comment,int number) {
        super(title, playtime, comment);
        this.number=number;

    }

    @Override
    public void print() {
        System.out.print("Dome:");
        super.print();
    }
}
