 package com.pharmacy.model;

public class Medicine {

    private int id;
    private String name;
    private String company;
    private double price;
    private int quantity;

    public Medicine() {
    }

    public Medicine(String name, String company, double price, int quantity) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}