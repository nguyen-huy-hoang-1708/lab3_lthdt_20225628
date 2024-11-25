
package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> items = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        items.add(disc);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2, DigitalVideoDisc dvd3) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
        addDigitalVideoDisc(dvd3);
        
       
    } 

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int count = 1;
        for (DigitalVideoDisc disc : items) {
            System.out.println(count + ". " + disc);
            count++;
        }
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc searchById(int id) {
        for (DigitalVideoDisc disc : items) {
            if (disc.getId() == id) {
                return disc;
            }
        }
        return null;
    }

    public ArrayList<DigitalVideoDisc> searchByTitle(String keyword) {
        ArrayList<DigitalVideoDisc> result = new ArrayList<>();
        for (DigitalVideoDisc disc : items) {
            if (disc.isMatch(keyword)) {
                result.add(disc);
            }
        }
        return result;
    }
}
