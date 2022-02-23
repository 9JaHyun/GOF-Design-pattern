package _05_facade_pattern._01_before;


public class Character {

    private String status;
    private String inventory;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public void loading() {
        System.out.println("=== Character Loading ===");
        System.out.println(status);
        System.out.println(inventory);
    }
}
