public class Item {
    int id;
    int price;
    String name;
    static int number_of_this_item=0;
    Item(int id,int price,String name){
        this.id=id;
        this.price=price;
        this.name=name;
    }
}
