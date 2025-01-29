//package name
package com.singlylinkedlist.inventorymanagementsystem;

//class
public class Inventory {

    String itemName;
    int itemID;
    int quantity;
    double price;
    Inventory next;

    //constructor
    public Inventory(String itemName, int itemID, int quantity, double price){
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next= null;
    }
}
