//package name
package com.singlylinkedlist.inventorymanagementsystem;

//class name
public  class InventoryManagement {

    static Inventory head;
    static Inventory tail;
    static Inventory temp;


    //creating method to add a element at the end of the linked list
    public static void addAtEnd(String itemName, int itemID, int quantity, double price){
        Inventory newInventory = new Inventory(itemName, itemID, quantity, price);
        if (head == null){
            head = newInventory;
            tail = newInventory;
        }else{
            tail.next = newInventory;
            tail = newInventory;
        }
    }

    //creating method to add a element in the front of the linked list
    public static void addAtFront(String itemName,int itemID, int quantity, double price){
        Inventory newInventory = new Inventory(itemName, itemID, quantity, price);
        if (head==null){
            head = newInventory;
            tail = newInventory;
        } else {
            newInventory.next = head;
            head = newInventory;
        }
    }

    //creating method to add a element in somewhere in the middle
    public static void addInMiddle(String itemName, int itemID, int quantity, double price, int itemIDbefore) {
        if (head == null) {
            System.out.println("List is empty. Cannot insert in the middle.");
            return;
        }

        Inventory temp = head;
        Inventory newInventory = new Inventory(itemName, itemID, quantity, price);

        while (temp != null && temp.itemID != itemIDbefore) {
            temp = temp.next;
        }

        if (temp != null) {
            newInventory.next = temp.next;
            temp.next = newInventory;

            if (temp == tail) {
                tail = newInventory;
            }
        } else {
            System.out.println("Item with ID " + itemIDbefore + " not found. Cannot insert.");
        }
    }


    //creating a method to print the linked list
    public static void printAll(){
        temp = head;
        while (temp != null){
            System.out.println(temp.itemName);
            System.out.println(temp.itemID);
            System.out.println(temp.quantity);
            System.out.println(temp.price);
            System.out.println();
            temp = temp.next;
        }
    }


    //creating method to remove item based on its itemid
    public static void removeItem(int itemID) {
        if (head == null) {
            System.out.println("List is empty. Cannot remove item.");
            return;
        }

        if (head.itemID == itemID) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        Inventory temp = head;
        while (temp.next != null && temp.next.itemID != itemID) {
            temp = temp.next;
        }

        if (temp.next != null) {
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next; // Remove node
        } else {
            System.out.println("Item with ID " + itemID + " not found.");
        }
    }

    //method to update the quantity based on its item id
    public static void updateQuantity(int itemID, int newQuantity) {
        if (head == null) {
            System.out.println("Inventory is empty. Cannot update quantity.");
            return;
        }

        Inventory temp = head;

        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = newQuantity;
                System.out.println("Updated quantity of item ID " + itemID + " to " + newQuantity);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item with ID " + itemID + " not found in inventory.");
    }


    //creating function to search the element by its item id
    public static void searchByID(int itemID) {
        Inventory temp = head;

        while (temp != null) {
            if (temp.itemID == itemID) {
                System.out.println("Item Found:");
                System.out.println("Item Name: " + temp.itemName);
                System.out.println("Item ID: " + temp.itemID);
                System.out.println("Quantity: " + temp.quantity);
                System.out.println("Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }



    //creating a function to calculate total inventory value
    public static void calculateTotalInventoryValue() {
        Inventory temp = head;
        double totalValue = 0;

        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }



    //creating function to sort the linked list by using itemID
    public static void sortByID() {
        if (head == null || head.next == null){
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Inventory current = head;
            Inventory prev = null;

            while (current != null && current.next != null) {
                if (current.itemID > current.next.itemID) {
                    // Swap nodes
                    if (prev == null) {
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }

                    Inventory temp = current.next.next;
                    current.next.next = current;
                    current.next = temp;

                    swapped = true;
                }

                prev = current;
                current = current.next;
            }
        } while (swapped);

        System.out.println("Inventory sorted by Item ID in Ascending order.");
    }


    public static void main(String[] args) {

        addAtEnd("Sugar", 101, 4, 23.5);
        addAtFront("Soap", 102, 4, 26.7);
        addInMiddle("Agarbatti", 103, 6, 12.5, 102);
        addInMiddle("Perfume", 104, 7, 109.50, 101);
        addAtFront("Pen", 105, 5, 6.5);
        addAtEnd("Earphone", 106, 2, 199);
        printAll();
        System.out.println();
        System.out.println();
        removeItem(102);
        removeItem(103);
        printAll();
        updateQuantity(106, 9);
        System.out.println();
        printAll();
        System.out.println();
        System.out.println();
        searchByID(104);
        System.out.println();
        System.out.println();
        calculateTotalInventoryValue();
        System.out.println();
        System.out.println();
        sortByID();
        printAll();

    }
}