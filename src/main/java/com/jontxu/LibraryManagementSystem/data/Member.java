package com.jontxu.LibraryManagementSystem.data;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private String address;
    private int phoneNumber;

    private List<LibraryItem> rentedItems;

    public Member(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        rentedItems = new ArrayList<>(3);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<LibraryItem> getRentedItems() {
        return rentedItems;
    }

    public void setRentedItems(List<LibraryItem> rentedItems) {
        this.rentedItems = rentedItems;
    }

    public void addRenteditem(LibraryItem item) {
        if(rentedItems.size() < 3) rentedItems.add(item);
    }

    public void removeRentedItem(LibraryItem item) {
        rentedItems.remove(item);
    }
}
