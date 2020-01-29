package database;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> items =new ArrayList<Item>();
    public void add(Item item){
        items.add(item);

    }
    public void list(){
        for(Item item:items){
            item.print();
            System.out.println();
        }

    }

    public static void main(String[] args) {
//       CD cd=new CD("a",90,"...","w");
////        Item item=(Item) cd;
////        CD cc=(CD)item;

        Database db=new Database();
        db.add(new CD("yuan", 30,"top","吴京"));
        db.add(new DVD("pang", 80, "verygood", "冯小刚"));
        db.add(new Dome("QING",50, "非常漂亮",0));
        db.list();
    }
}
