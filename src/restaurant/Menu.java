package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        return "Menu: \n" +
                "\n" + menuItems +
                "\nLast updated on:" + lastUpdated;
    }

    public void addItem(MenuItem item) {
        if (!menuItems.contains(item)) {
            menuItems.add(item);
        }
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
    }




    public Date getLastUpdated() {
        return this.lastUpdated;
    }

}
