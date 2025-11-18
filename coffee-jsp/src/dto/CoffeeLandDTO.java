package dto;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeLandDTO implements Serializable,Comparable<Integer> {
    private int size;
    private float total;
    private String quantity;
    private float expend;
    private float profit;
    private String Fert;

    public CoffeeLandDTO(){
        System.out.println("The CoffeeLandDTO is created");
    }

    public CoffeeLandDTO(int size,float total,String quantity,float expend,float profit,String Fert){
        this.size=size;
        this.total=total;
        this.quantity=quantity;
        this.expend=expend;
        this.profit=profit;
        this.Fert=Fert;
    }
    @Override
    public int compareTo(Integer o) {
        return this.size-o;
    }

    @Override
    public String toString() {
        return "CoffeeLandImpl{" +
                "size=" + size +
                ", total='" + total + '\'' +
                ", quantity='" + quantity + '\'' +
                ", expend='" + expend + '\'' +
                ", profit=" + profit +
                ", Fert='" + Fert + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeLandDTO that = (CoffeeLandDTO) o;
        return size == that.size && Objects.equals(total, that.total) && Objects.equals(quantity, that.quantity) && Objects.equals(expend, that.expend) && Objects.equals(profit, that.profit) && Objects.equals(Fert, that.Fert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, quantity, expend, profit, Fert);
    }
}
