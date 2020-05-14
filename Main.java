

public class Main {
    public static void main(String[] args) {
        Bookstore store = new Bookstore("Barnes", "1234 Charlotte Road", true, 10, 1000, true);

        System.out.println("What is the address?");
        System.out.println(store.getName());
        System.out.println(store.getAddress());
        System.out.println("Is the store open today?");
        System.out.println(store.getOpenToday());
        System.out.println("What time does it close?");
        System.out.println(store.getCloseTime());
        System.out.println("How big is the store?");
        System.out.println(store.getStoreSize());
        System.out.println("Does the store have used books?");
        System.out.println(store.getUsedBooks());
    }
}