package database;

public class DVD extends Item {

    private String director;


    public DVD(String title,int playtime, String comment, String director) {
          super(title,playtime,comment);
        this.director = director;

    }
   public void print(){
    System.out.print("DVD:"+" ");
       super.print();
     System.out.print(director+" ");


    }
}
