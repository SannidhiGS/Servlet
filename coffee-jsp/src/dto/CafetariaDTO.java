package dto;

import service.CafetariaService;

import java.io.Serializable;
import java.util.Objects;

public class CafetariaDTO implements Serializable,Comparable<String> {
    private String name;
    private String type;
    private String location ;
    private float price;
    private String franch;
    private String owner;
    private long gst;

    public CafetariaDTO() {
        System.out.println("The Cafetaria Dto");
    }

    public CafetariaDTO(String name,String type,String location,float price,String franch,String owner,long gst ){
        this.name=name;
        this.type=type;
        this.location=location;
        this.price=price;
        this.franch=franch;
        this.owner=owner;
        this.gst=gst;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public float getPrice() {
        return price;
    }

    public String getFranch() {
        return franch;
    }

    public String getOwner() {
        return owner;
    }
    public long getGst() {
        return gst;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFranch(String franch) {
        this.franch = franch;
    }

    public void setGst(long gst) {
        this.gst = gst;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CafetariaDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", franch='" + franch + '\'' +
                ", owner='" + owner + '\'' +
                ", gst=" + gst +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CafetariaDTO that = (CafetariaDTO) o;
        return Float.compare(price, that.price) == 0 && gst == that.gst && Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(franch, that.franch) && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, price, franch, owner, gst);
    }

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }


}
