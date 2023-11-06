package src.Personagem;

import java.util.ArrayList;

import src.Item;

public class Inventario {
    private ArrayList<Item> hotbar = new ArrayList<Item>();
    private ArrayList<Item> biggerInventory = new ArrayList<Item>();
    private ArrayList<Item> armorSet = new ArrayList<Item>();

    public Inventario (int hotbarCap, int biggerInventoryCap) {
        hotbar.ensureCapacity(hotbarCap);
        biggerInventory.ensureCapacity(biggerInventoryCap);
        armorSet.ensureCapacity(5);
    }

    public void addItem(Item item) {
    }
    public void removeItem(Item item) {
    }
    public void equipItem(Item item) {}
}
