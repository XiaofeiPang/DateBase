package database;

public class CD  extends  Item{

    private String artist;

    public CD(String title,int playtime, String comment,String artist) {
         super(title,playtime,comment);
        this.artist = artist;

    }


public  void print(){
        System.out.print("CD:"+" ");
        super.print();
        System.out.println(artist+" ");

    }


    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        CD cc=(CD)obj;
        return artist.equals(cc.artist);
    }

    public static void main(String[] args) {
        CD cd=new CD("ASD",50,"LALA","飞");

        System.out.println(cd.toString());
        CD cd1=new CD("ASD",50,"LALA","飞");
        System.out.println(cd.equals(cd1));

    }

}
