package _03_composite_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        Item wood = new Item("가문비나무", 10);
        Item sugarCane = new Item("사탕수수", 20);

        Inventory inventory = new Inventory();
        inventory.add(wood);
        inventory.add(sugarCane);

        Client client = new Client();
        client.printAmount(wood);
        client.printAmount(sugarCane);
        System.out.println("Inventory Total Amount");
        client.printAmount(inventory);
    }

    private void printAmount(Item item) {
        System.out.println(item.getAmount());
    }

    private void printAmount(Inventory inventory) {
        // Reduce를 사용한 값
        Integer sumByReduce = inventory.getItems()
            .stream().map(Item::getAmount)
            .reduce(0, Integer::sum);

//        int sumByIntStream = inventory.getItems()
//            .stream().mapToInt(Item::getAmount)
//            .sum();
//
        System.out.println(sumByReduce);
//        System.out.println(sumByIntStream);
    }
}
