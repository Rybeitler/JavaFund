import java.util.ArrayList;
import java.text.*;
public class CafeUtil{
    public int getStreakGoal(int numWeeks){
        int total = 0;
        for(int i=1; i<=numWeeks; i++){
            total += i;
        }
        return total;
    }

    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(double price : prices){
            total += price;
        }
        return total;
    }
    
    public void displayMenu(ArrayList<String>menuItems){
        for(int i=0; i< menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public boolean displayMenu(ArrayList<String>menuItems, ArrayList<Double>prices){
        DecimalFormat formatter = new DecimalFormat("$###.00");
        if(menuItems.size() == prices.size()){
            for(int i=0; i< menuItems.size(); i++){
                System.out.println(i + " " + menuItems.get(i) + " -- " + formatter.format(prices.get(i)));
            }
            return true;
        }
        return false;
    }


    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println("All customers: " + customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        DecimalFormat formatter = new DecimalFormat("$###.00");

        System.out.println(product);
        double total = 0;
        for (int i=1; i<=maxQuantity; i++){
            if(i==1){
                total+=price;
                System.out.println(i+" - "+ formatter.format(total));
            }else{
                total+=(price-.50);
                System.out.println(i+" - "+ formatter.format(total));
            }
        }
    }

    public void addCustomers(ArrayList<String>customers){
        System.out.println("Enter Customers Names(type q to quit)");
        String userName = "";
        while(!userName.equals("q")){
            System.out.println("Name: ");
            userName = System.console().readLine();
            customers.add(userName);
        }
    }
}