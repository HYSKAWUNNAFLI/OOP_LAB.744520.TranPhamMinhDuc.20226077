public class Aims {

    public static void main(String[] args) {
        // Creating DigitalVideoDisc objects with various constructors
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Initialize the Cart and add discs
        Cart cart = new Cart();
        cart.addDisc(dvd1);
        cart.addDisc(dvd2);
        cart.addDisc(dvd3);
        
        // Remove one item from the cart
        cart.removeDisc(dvd2);

        // Display total cost
        System.out.println("Total cost of items in cart: " + cart.totalCost());
    }
}
