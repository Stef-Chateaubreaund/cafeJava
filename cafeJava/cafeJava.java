import java.text.DecimalFormat;

public class cafeJava {

    // n- use for decimals in double formatting
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffee = 2.00;
        double latte = 4.00;
        double cappuccino = 2.75;

        // Customer name variables (add yours below)
        char spc = ' ';
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        System.out.println("");
        // ** customer1 orders a coffee ** //
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + spc + ',' + spc + displayTotalMessage + dripCoffee);
        System.out.println(customer1 + pendingMessage);
        System.out.println("");

        // ** customer4 orders a cappuccino ** //
        System.out.println(generalGreeting + customer4);
        System.out.println(customer4 + spc + ',' + spc + displayTotalMessage + cappuccino);
        System.out.println("");
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println("");

        // ** customer2 orders 2 lattes ** //
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2 + spc + ',' + spc + displayTotalMessage + latte * 2);
        System.out.println("");
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println("");

        // ** customer3 was charged for a coffee when he ordered a latte ** //
        System.out.println(customer3 + spc + ',' + spc + displayTotalMessage + df.format(latte - dripCoffee));
        System.out.println("");

        // ** customer3 was charged for a coffee when he ordered a latte ** //
        System.out.println("");

        System.out.println("");
    }
}