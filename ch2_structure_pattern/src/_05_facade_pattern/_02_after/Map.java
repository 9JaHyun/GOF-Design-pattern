package _05_facade_pattern._02_after;

public class Map {

    private String terrain;
    private String monster;
    private String npc;
    private String item;

    public Map(String terrain, String monster, String npc, String item) {
        this.terrain = terrain;
        this.monster = monster;
        this.npc = npc;
        this.item = item;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public String getNpc() {
        return npc;
    }

    public void setNpc(String npc) {
        this.npc = npc;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void loading() {
        System.out.println("=== Map Loading ===");
        System.out.println(terrain);
        System.out.println(monster);
        System.out.println(npc);
        System.out.println(item);
    }
}
