package _03_composite_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        Item wood = new Item("가문비나무", 10);
        Item sugarCane = new Item("사탕수수", 10);

        Inventory inventory = new Inventory();
        inventory.add(wood);
        inventory.add(sugarCane);

        Client client = new Client();
        client.printAmount(wood);
        client.printAmount(sugarCane);
        client.printAmount(inventory);
    }

    private void printAmount(Component component) {
        System.out.println(component.getAmount());
    }
}
