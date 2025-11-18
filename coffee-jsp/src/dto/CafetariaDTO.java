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
