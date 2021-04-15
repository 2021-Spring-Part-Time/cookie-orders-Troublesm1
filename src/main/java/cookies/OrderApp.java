package cookies;

public class OrderApp {
    public static void main(String[] args) {

        MasterOrder myOrder = new MasterOrder();
        myOrder.addOrder(new CookieOrder("Tagalongs", 1));
        myOrder.addOrder(new CookieOrder("Thin Mints", 5));
        myOrder.addOrder(new CookieOrder("Samoas", 2));
        myOrder.addOrder(new CookieOrder("Tagalongs", 3));

        System.out.println("Current Order");
        myOrder.showOrder();
        System.out.println("You have ordered " + myOrder.getTotalBoxes() + " boxes");
        

    }
}
