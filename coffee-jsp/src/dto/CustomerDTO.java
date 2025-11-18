package dto;

import com.sun.javafx.image.impl.ByteIndexed;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable,Comparable<String> {
    private String name;
    private long mobile;
    private String type;
    private int quantity;
    private String payment;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
    public CustomerDTO(){
        System.out.println("The Customer Dto created");
    }

    public CustomerDTO(String name,long mobile,String type,int quantity,String payment){
        this.name=name;
        this.mobile=mobile;
        this.type=type;
        this.quantity=quantity;
        this.payment=payment;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", payment='" + payment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return mobile == that.mobile && quantity == that.quantity && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(payment, that.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile, type, quantity, payment);
    }

}
