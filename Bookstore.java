import java.util.*;
import java.io.IOException;

public class Bookstore {
    private String name, address, openToday, usedBooks;
    private int storeSize, close;
    private ArrayList<String> titles;

    public Bookstore(String name, String address, boolean openToday, int close, int storeSize, boolean usedBooks) {
        setName(name);
        setAddress(address);
        setOpenToday(openToday);
        setCloseTime(close);
        setStoreSize(storeSize);
        setUsedBooks(usedBooks);

        titles = new ArrayList<String>();
        loadTitles();
        System.out.println(titles);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenToday() {
        return openToday;
    }

    public void setOpenToday(boolean open) {
        if (open == true) {
            this.openToday = "The store is open.";
        } else {
            this.openToday = "The store is closed.";
        }
    }

    public Integer getCloseTime() {
        return close;
    }

    public void setCloseTime(int close) {
        this.close = close;
    }

    public Integer getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(int storeSize) {
        this.storeSize = storeSize;
    }

    public String getUsedBooks() {
        return usedBooks;
    }

    public void setUsedBooks(boolean usedBooks) {
        if (usedBooks == true) {
            this.usedBooks = "The library DOES have used books.";
        } else {
            this.usedBooks = "The library DOES NOT have used books.";
        }
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }
}