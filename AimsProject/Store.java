
package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        itemsInStore.remove(dvd);
    }
}  
