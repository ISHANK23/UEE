package com.example.uee;

public class Category {

    String id;
    String name;
    String email;
    String address;
    String number;
    String item_type;
    String item_name;

    public Category(String id, String name, String email, String address, String number, String item_type, String item_name) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.number = number;
        this.item_type = item_type;
        this.item_name = item_name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getItem_name() {
        return item_name;
    }
}
