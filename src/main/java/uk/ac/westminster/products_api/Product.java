package uk.ac.westminster.products_api;

public class Product {
    private Long id; // access modifier: private
    private String name; // access modifier: private
    private double price; // access modifier: private


    // constructor 1
    public Product(){

    }

    // constructor 2 with 3 parameters
    public Product (Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
