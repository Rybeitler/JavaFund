public class CafeJava{
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice =3.5;
        double dripCoffeePrice =2.0;
        double lattePrice = 3.0;
        double cappucinoPrice = 2.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        System.out.println(customer1 + pendingMessage);
        
        System.out.println(isReadyOrder4 ? customer4 + readyMessage + "\n" + displayTotalMessage + cappucinoPrice  : customer4 + pendingMessage);

        System.out.println(displayTotalMessage + (lattePrice*2));
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage );

        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }
}