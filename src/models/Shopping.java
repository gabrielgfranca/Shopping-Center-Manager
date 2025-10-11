package models;

import models.subStores.*;

import java.util.Arrays;

public class Shopping {
    private String name;
    private Address address;
    private Store[] stores;

    public Shopping(String name, Address address, int maximumStores) {
        this.name = name;
        this.address = address;
        this.stores = new Store[maximumStores];
    }

    public String getName() { return name; }
    public Address getAddress() { return address; }
    public Store[] getStores() { return stores; }
    public void setName(String name) { this.name = name; }
    public void setAddress(Address address) { this.address = address; }
    public void setStores(Store[] stores) { this.stores = stores; }

    @Override
    public String toString() {
        return "Shopping{" + "name: " + name + ", address: " + address + ", stores: " + Arrays.toString(stores) + " }";
    }

    public boolean insertStore(Store store) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                stores[i] = store;
                return true;
            }
        }
        return false;
    }

    public boolean deleteStore(String storeName) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i].getName().equals(storeName)) {
                stores[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantityStoresByType(String type) {
        int quantity = 0;
        for (Store store : stores) {
            if (store != null && store.getType().equalsIgnoreCase(type)) {
                quantity++;
            }
        }
        return quantity;
    }

    public Computing MostExpensiveInsuranceStore() {
        Computing expansiveStore = null;
        double biggestInsurance = Double.MIN_VALUE;

        for (Store store : stores) {
            if (store instanceof Computing computingStore) {
                if (computingStore.getElectronicsInsurance() > biggestInsurance) {
                    biggestInsurance = computingStore.getElectronicsInsurance();
                    expansiveStore = computingStore;
                }
            }
        }

        return expansiveStore;
    }
}
