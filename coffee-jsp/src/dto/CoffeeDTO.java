package dto;

import com.xworkz.coffee.CoffeeServlet;

import java.io.Serializable;
import java.util.Comparator;

public class CoffeeDTO implements Serializable, Comparable<String> {
    public CoffeeDTO(){
        System.out.println("The CoffeeDTO created");
    }
    private String type;
    private float price;
    private String farmer;
    private float quantity;
    private String location;

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public String getFarmer() {
        return farmer;
    }

    public float getQuantity() {
        return quantity;
    }
    public String getLocation() {
        return location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CoffeeDTO(String type, float price, String farmer, float quantity, String location){
        this.type=type;
        this.price=price;
        this.farmer=farmer;
        this.quantity=quantity;
        this.location=location;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "CoffeeDTO{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", farmer='" + farmer + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(String o) {
        return this.type.compareTo(o);
    }
}
