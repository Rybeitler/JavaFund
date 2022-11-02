import java.util.ArrayList;
import java.text.*;

public class Order{
    private String name;
    private boolean ready;
    private ArrayList<Item> items;
//constructor
    public Order(){
        this.name = "guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
//methods
    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if (ready){
            return "Your order is ready";
        }else{
            return "Than you for waiting. Your order will be ready soon";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item item: items){
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        DecimalFormat formatter = new DecimalFormat("$###.00");
        System.out.println("Customer Name: "+ name);
        double total = 0;
        for (Item item: items){
            System.out.println(item.getName()+" - "+formatter.format(item.getPrice()));
            total += item.getPrice();
        }
        System.out.println("Total: "+ formatter.format(total));
    }
//getter/setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

}