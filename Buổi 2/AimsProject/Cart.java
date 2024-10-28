public class Cart {

    private static final int MAX_ITEMS = 20;
    private DigitalVideoDisc[] items = new DigitalVideoDisc[MAX_ITEMS];
    private int itemCount = 0;

    public void addDisc(DigitalVideoDisc disc) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount++] = disc;
            System.out.println("Disc added to cart.");
        } else {
            System.out.println("Cart is full, cannot add more items.");
        }
    }

    public void removeDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null && items[i].getTitle().equals(disc.getTitle())) {
                items[i] = null;
                System.out.println("Disc removed from cart.");
                itemCount--;
                return;
            }
        }
        System.out.println("Disc not found in the cart.");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null) {
                total += items[i].getCost();
            }
        }
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }
}
