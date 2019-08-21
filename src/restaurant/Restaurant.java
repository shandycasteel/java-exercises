package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem fish = new MenuItem(" Salmon", 19.99, "Grilled, topped with lemon butter", "Dinner");
        MenuItem steak = new MenuItem("NY Strip", 28.99, "16-ounce grilled strip glazed with bourbon", "Dinner");
        MenuItem chicken = new MenuItem("Blackened Chicken", 17.99, "Spiced up and ready to cluck", "Dinner");


        Menu dinnerMenu = new Menu();

        dinnerMenu.addItem(fish);
        dinnerMenu.addItem(steak);
        dinnerMenu.addItem(chicken);

        System.out.println(dinnerMenu);
    }
}
