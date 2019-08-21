package restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;

    }

    @Override
    public String toString() {
        return name +
                "\n" + price +
                "\n" + description +
                "\n" + category +
                "\nNew: " + isNew +
                "\n\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, category);
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public boolean setIsNew() {
        return this.isNew;
    }

}
