package database;

public class Item {
    private String title;
    private int playtime;
    private String comment;

    public Item(String title, int playtime, String comment) {
        super();
        this.title = title;
        this.playtime = playtime;
        this.comment = comment;
    }



    public void print() {
        System.out.print(title+" "+playtime+" "+comment+" ");
    }


}
